def call(){
    sh"""
    trivy image ${hubUser}/${project} ${hubUser}/${project}:latest > scan.txt
    cat scan.txt
     
    """
}
