def call(String project, String Imagetag, String hubUser) {
    bat "trivy image scan ${hubUser}/${project}:latest" > scanResults.txt
    type "scanResults.txt"
}