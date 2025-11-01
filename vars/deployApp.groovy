// vars/deployApp.groovy
def call(String imageName, String containerName, String port) {
    echo "🚀 Deploying ${containerName} using image ${imageName}"
    sh """
    docker stop ${containerName} || true
    docker rm ${containerName} || true
    docker run -d -p ${port}:8080 --name ${containerName} ${imageName}
    """
}

