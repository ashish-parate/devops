pipeline {
    agent any
    stages {
        stage('pull') {
            steps {
                echo 'pull succes'
            }    
        }
        
        stage('build') {
            steps {
                echo 'congo build is done'
                
            }
           
        }
        
        stage('test') {
            steps {
                echo 'test is ok'
                
            }
            
        }
        stage('deploy'){
            steps {
                echo 'deploy done'
                
            }
            
        }
    }
}