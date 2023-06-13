def call(){
    sh"""
    trivy image ${hubUser}/${project}:latest > scan.txt
    cat scan.txt
     
    """
}
