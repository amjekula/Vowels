pipeline {
    
    agent{
        label 'linux-agent'
    }
    
    stages {
      stage('Clean & Deploy to Nexus') {
        steps {
        withMaven(maven: 'maven3'){
            sh 'mvn clean deploy'
            }
        }
      }
    }
}
