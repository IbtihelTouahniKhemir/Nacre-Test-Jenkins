pipeline {
    agent any

    tools {
        maven 'Maven-Choco'
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
                echo '✅ Code récupéré'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean verify -U'
                echo '✅ Build réussi'
            }
        }

        stage('Archive P2 Repository') {
            steps {
                archiveArtifacts artifacts: 'releng/p2/target/repository/**', fingerprint: true
                echo '✅ Repository p2 archivé'
            }
        }
    }

    post {
        success {
            echo '🎉 BUILD SUCCESS'
        }
        failure {
            echo '❌ BUILD FAILED'
        }
    }
}