pipeline {
  agent any
  stages {
	stage('Unit Test') {
	   steps {
	       sh label: 'Test running', script: '''mvn test'''
	       echo 'Hello Testing done'
       }
   	}
	stage('Maven Build'){
		steps{
				sh label:'Maven Build of war file', script:'''
					mvn clean install -DskipTests=false
					mvn package
				'''
		}
	}    
    
  }
}