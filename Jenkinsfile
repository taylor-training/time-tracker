pipeline { 
    agent any  
    stages { 
        stage('Clone') { 
            steps { 
               echo 'Cloning from repositories' 
            }
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
            }
        }
        stage('Deploy') { 
            steps { 
               echo 'Deploying the project' 
            }
        } 
    }
}
