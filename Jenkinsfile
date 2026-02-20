pipeline {
    agent any

    tools {
        maven 'Maven-Choco'
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}