pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                bat 'mvn clean package -DskipTest=true'
            }
        }
        stage('Tests'){
              steps{
                 bat 'mvn test'
        }
    }
        stage('Deploy'){
              steps{
                 deploy adapters: [tomcat9(path: '', url: 'http://localhost:9000/')], contextPath: 'calculadora ', war: 'target/calculadora.war'
              }
        }
    }
}