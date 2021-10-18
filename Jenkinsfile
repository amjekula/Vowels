pipeline {
    //agent any
    agent{
        label 'linux-agent'
        //docker{ image 'jenkins/inbound-agent'}
    }
    stages {
      stage('Clean') {
        steps {
           withMaven (maven: 'maven3'){
                sh 'mvn clean'
           }
        }
      }

      stage('Test') {
        steps {
        withMaven(maven: 'maven3'){
            sh 'mvn test'
            }
        }
      }
    }
}
