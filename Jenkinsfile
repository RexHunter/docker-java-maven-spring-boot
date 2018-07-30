pipeline { 
    agent {
        docker {
                image 'maven' 
                args '-v /root/.m2:/root/.m2' 
        }
    }
    stages { 
        stage('Build java') { 
           steps {
                sh 'mvn package' 
            }
           
        }
        stage('Build image') {
            steps{
                /* This builds the actual image; synonymous to
                 * docker build on the command line */
                    app = docker.build("rexxie/docker-java-maven-spring-boot")
            }
        }
    }
}
