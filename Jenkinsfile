pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/VAIBHAVMANIK/LAB_TEST.git', credentialsId: 'github_credentials'
            }
        }
        stage('Build and Push') {
            steps {
                script {
                    def registry = "fost10"
                    def image = "factorial"
                    def tag = "1.0"
                    def password = "vaibhav@cadc"
                    sh "javac Factorial.java"
                    sh "docker build -t ${registry}/${image}:${tag} ."
                    sh "docker login -u ${registry} -p ${password}"
                    sh "docker push ${registry}/${image}:${tag}"
                }
            }
        }
    }
}
