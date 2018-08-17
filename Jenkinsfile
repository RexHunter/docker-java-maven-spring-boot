node {
    def app
    agent any
    
        stage('Clone repository') {
            checkout scm
        }
        stage('Build image') {
            app = docker.build("rexxie/docker-java-maven-spring-boot")
        }
    
}
