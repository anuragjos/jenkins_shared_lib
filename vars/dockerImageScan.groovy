def call(String project, String Imagetag, String hubUser) {
    bat "trivy image scan ${hubUser}/${project}:${Imagetag}" > scanResults.txt
    type "scanResults.txt"
}