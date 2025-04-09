def call() {
    stage('Checkout') {
        checkout scm
    }

    stage('Unit Tests') {
        echo 'Running unit tests...'
        sh './gradlew test'
    }

    stage('Deploy') {
        echo "Deploying to ${env.ENVIRONMENT} environment..."
        // You can add deployment logic here
    }
}
