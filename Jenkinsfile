pipeline {
    agent any

    tools {
        maven 'Maven-Choco'  // Remplace par le nom exact de ton Maven dans Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                // Jenkins va automatiquement faire le git checkout
                echo 'Checkout du code depuis GitLab'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'  // Windows : compile et package le projet Maven
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'  // Exécute les tests
            }
        }

        stage('Archive') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
}