def call(String credentialsId) {
    withCredentials([string(credentialsId: credentialsId, variable: 'SONAR_TOKEN')]) {
        bat """
            mvn clean verify sonar:sonar ^
            -Dsonar.projectKey=kubernetes-configmap-reload ^
            -Dsonar.host.url=http://localhost:9000 ^
            -Dsonar.login=%SONAR_TOKEN%
        """
    }
}