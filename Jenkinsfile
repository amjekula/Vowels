pipeline {
    
    agent{
        label 'linux-agent'
    }
    
    stages {
      stage('Test') {
        steps {
        withMaven(maven: 'maven3'){
            sh 'mvn test deploy'
            }
        }
      }
    }
}
