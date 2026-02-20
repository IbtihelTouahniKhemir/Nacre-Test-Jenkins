pipeline {
    agent any

    tools {
        maven 'Maven-Choco' // ou le nom exact dans Jenkins
    }

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
    }
}