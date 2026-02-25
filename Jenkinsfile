pipeline {
    agent any

    tools {
        maven 'Maven-Choco'   // Nom exact de Maven configuré dans Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
                echo '✅ Code récupéré'
            }
        }

        stage('Check Java & Maven') {
            steps {
                bat 'java -version'
                bat 'echo %JAVA_HOME%'
                bat 'mvn -version'
            }
        }

        stage('Test Maven Central') {
            steps {
                bat 'curl -I https://repo.maven.apache.org/maven2/org/bouncycastle/bcprov-jdk18on/1.71.1/bcprov-jdk18on-1.71.1.pom || echo "⚠️ Impossible d’accéder à Maven Central"'
            }
        }

        stage('Build') {
            steps {
                // -U force la mise à jour de toutes les dépendances
                // -e affiche les erreurs complètes
                // -X mode debug pour voir exactement quel artefact pose problème
                bat 'mvn clean package -U -e -X'
                echo '✅ Build Maven terminé'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test -U -e'
            }
            post {
                success {
                    echo '✅ Tous les tests sont passés'
                }
                failure {
                    echo '❌ Certains tests ont échoué !'
                    error('Arrêt du pipeline : tests échoués')
                }
            }
        }

        stage('Archive') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
                echo '✅ Artefacts archivés'
            }
        }
    }

    post {
        success {
            echo '🎉 Build complet et réussi !'
        }
        failure {
            echo '😢 Build échoué'
        }
    }
}