pipeline {
    agent any

    tools {
        maven 'Maven-Choco'   // Nom exact de Maven configuré dans Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
                echo 'Code récupéré'
            }
        }

        stage('Build') {
    steps {
        bat 'mvn clean package -DbuildRCP=true'
        echo 'Build Maven terminé (avec RCP)'
    }
}

        stage('Test') {
            steps {
                bat 'mvn test'
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
        archiveArtifacts artifacts: '**/rcp/target/products/**/*', fingerprint: true
        echo 'Artefacts RCP archivés'
    }
}
    }

    post {
        success {
            echo '🎉Build complet et réussi !'
        }
        failure {
            echo '😢 Build échoué'
        }
    }
}