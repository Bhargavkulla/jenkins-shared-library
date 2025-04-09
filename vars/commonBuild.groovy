def call() {
    stage('Checkout') {
        git url: 'https://github.com/YOUR-REPO/sample-app.git', branch: 'main'
    }
    stage('Unit Tests') {
        echo 'Running unit tests...'
        sh './gradlew test'
    }
}
