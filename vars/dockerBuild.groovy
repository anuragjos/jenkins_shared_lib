def call(String project, String Imagetag, String hubUser) {
    bat "docker build -t ${hubUser}/${project}:${Imagetag} ."
    bat "docker image tag ${hubUser}/${project}:${Imagetag} ${hubUser}/${project}:latest"
    bat "docker images"
}