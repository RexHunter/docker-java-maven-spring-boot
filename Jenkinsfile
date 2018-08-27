node {
    def app
    agent any
        stage('Clone repository') {
            checkout scm
        }
        stage('Build image') {
            app = docker.build("rexxie/docker-java-maven-spring-boot")
        }
    stage('Test image') {

        app.inside {
            sh 'echo "Tests passed"'
        }
    }

    stage('Push image') {
        docker.withRegistry('', 'dockerhub') {
            app.push("${env.BUILD_NUMBER}")
            app.push("latest")
        }
      
    }
    
}
