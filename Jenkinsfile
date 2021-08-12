

pipeline {
    agent any

    stages {
       stage ('Checkout Java Code'){
            steps{
           git branch: 'main', credentialsId: 'navneetchourey', url: 'https://github.com/navneetchourey/corejavaessentials.git'
                 }
			}
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('How are you?') {
            steps {
                echo 'How are you?'
            }
        }
        stage ('SAST'){
          parallel{
            stage ('sonar-scan'){
              steps {
                echo 'Running Sonar Scan'
              }
            }
            stage ('synk-scan'){
              steps {
                echo 'Synk scan'
              }
            }
            stage ('DC'){
              steps {
                echo 'Running Dependency Check'
              }
            }
          }
        }
    }
}
