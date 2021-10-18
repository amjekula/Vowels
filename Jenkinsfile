pipeline {
    //agent any
    agent{
        //label 'linux-agent'
        docker{ image 'jenkinsci/jnlp-slave'}
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
