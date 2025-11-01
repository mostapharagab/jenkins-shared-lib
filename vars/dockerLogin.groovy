// vars/dockerLogin.groovy
def call(String username, String credentialsId) {
    withCredentials([string(credentialsId: credentialsId, variable: 'DOCKERHUB_PASS')]) {
        sh "echo \$DOCKERHUB_PASS | docker login -u ${username} --password-stdin"
    }
}
