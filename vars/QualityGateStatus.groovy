def call(){
    waitForQualityGate abortPipeline: false, credentialsId: 'sonarqube-api'
}