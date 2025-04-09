def call() {
    stage('Checkout') {
        git url: 'https://github.com/Bhargavkulla/sample-java-app.git', branch: 'main'
    }
    stage('Unit Tests') {
        echo 'Running unit tests...'
        sh 'echo "Pretending to run tests..."'
    }
}
