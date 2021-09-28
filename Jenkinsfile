<<<<<<< HEAD
pipeline {
    agent maven
    tools {
        maven
    }
    stages {
        stage ('Cloning the repository') {
            steps {
                sh '''
                    echo "Cloning the rpo"
                '''
				}
		}
		stage ('Maven Build') {	
			steps {
                sh '''
                    echo "Maven Build"
                '''
				}
		}			
		stage ('Maven Test') {	
			steps {
                sh '''
                    echo "Maven test"
                '''
				}
		}
		stage ('Deploy') {	
				steps {
                sh '''
                    echo "Deploy"
                '''
				}
=======
pipeline { 
    agent any  
    stages { 
        stage('Clone') { 
            steps { 
               echo 'Cloning from repositories' 
            }
>>>>>>> 66a7fb16bac3dba9bb468c36e0b149e940c021df
        }
         stage('Build') { 
            steps { 
               echo 'Build the maven project'
               sh 'mvn clean install'
            }
        }
        stage('Testing') { 
            steps { 
               echo 'Testing the project' 
                sh 'mvn test'
            }
        }
        stage('Deploy') { 
            steps { 
               echo 'Deploying the project' 
                sh 'cp -rf /root/.jenkins/workspace/Demo/target/java-tomcat-maven-example.war /opt/tomcat/webapps'
            }
        } 
    }
}
