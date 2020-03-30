pipeline {
  agent any
  stages {
	stage('Unit Test') {
	   steps {
	       bat label: 'Test running', script: '''mvn test'''
	       echo 'Hello Testing done'
       }
   	}
	stage('Maven Build'){
		steps{
				bat label:'Maven Build of war file', script:'''
					mvn clean install -DskipTests=false
					mvn package
				'''
		}
	}    
    
  }
}