pipeline { 
    def app
    agent any
    
    stage('Clone repository') {
        /* Let's make sure we have the repository cloned to our workspace */
        checkout scm
    }

        /*stage('Build java') { 
           steps {
                sh 'mvn package' 
            }
            */
            stage('Build image') {
            
                /* This builds the actual image; synonymous to
                 * docker build on the command line */
                    app = docker.build("rexxie/docker-java-maven-spring-boot")
            
        }
    }
}
