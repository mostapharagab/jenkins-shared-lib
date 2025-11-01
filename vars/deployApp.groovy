// vars/deployApp.groovy
def call(String imageTag, String containerName, String port) {
    sh """
        echo "🚀 Deploying container..."
        docker stop ${containerName} || true
        docker rm ${containerName} || true
        docker run -d -p ${port}:8080 --name ${containerName} ${imageTag}
        echo "✅ App is running on http://<server-ip>:${port}"
    """
}
