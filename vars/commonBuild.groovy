def call() {
    stage('Checkout') {
        git url: 'https://github.com/Bhargavkulla/jenkins-shared-library.git', branch: 'main'
    }
    stage('Unit Tests') {
        echo 'Running unit tests...'
        sh './gradlew test'
    }
}
