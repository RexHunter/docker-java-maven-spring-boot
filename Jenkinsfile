pipeline {  
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v $HOME/.m2:/root/.m2'
        }
    }
    stages {
        stage('Clone repository') {
            steps {
                checkout scm
            }
        }
      

        stage('Build java') { 
           steps {
                sh 'mvn package' 
            }
        }
            
         stage('Build image') {
            steps {   
                docker.build("rexxie/docker-java-maven-spring-boot")
            }
        }
    }
}
