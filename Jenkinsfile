pipeline {
    //agent any
    agent{
        label 'linux-agent'
        //docker{ image 'jenkins/inbound-agent'}
    }
    stages {
      stage('maven compile') {
        steps {
           withMaven (maven: 'maven3'){
                sh 'mvn clean compile'
           }
        }
      }

      stage('maven test') {
        steps {
        withMaven(maven: 'maven3'){
            sh 'mvn test'
            }
        }
      }
    }
}
