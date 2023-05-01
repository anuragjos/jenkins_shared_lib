def call(credentialsId){
    withSonarQubeEnv(credentialsId: credentialsId) {
      sh 'mvn clean sonar:sonar'
    }
   
}