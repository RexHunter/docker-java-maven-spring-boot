node {
    def app
    agent any
    stages {
        stage('Clone repository') {
            checkout scm
        }
        stage('Build image') {
            app = docker.build("rexxie/docker-java-maven-spring-boot")
        }
    }
}
