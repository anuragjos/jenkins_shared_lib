def call(String project, String Imagetag, String hubUser) {
    bat "docker image build -t ${hubUser}:${project} ."
    bat "docker image tag ${hubUser}/${project} ${hubUser}/${project}:${Imagetag}"
    bat "docker image tag ${hubUser}/${project} ${hubUser}/${project}:latest"
}