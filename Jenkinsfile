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
stage('Test') {
    steps {
        bat 'mvn test'
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