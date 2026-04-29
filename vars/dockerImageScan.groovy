def call(String project, String imageTag, String hubUser) {

    bat """
        trivy image --severity HIGH,CRITICAL --format table -o scanResults.txt ${hubUser}/${project}:${imageTag}
    """

    bat 'type scanResults.txt'

    def scanResults = readFile('scanResults.txt')

    if (scanResults.contains("CRITICAL")) {
        error "Critical vulnerabilities found in Docker image!"
    } else {
        echo "Docker image scan passed successfully."
    }
}