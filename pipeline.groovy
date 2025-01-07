pipeline {
    agent any
    stages {
        stage('Clean Workspace') {
            steps {
                // Clean workspace to start fresh
                cleanWs()
            }
        }
        stage('Clone Repository') {
            steps {
                // Clone the repository using shell commands
                echo 'Cloning the repository...'
                sh 'git clone -b dev https://github.com/shomronh/certis.git'
                echo 'Repository cloned successfully.'
            }
        }
        stage('Build') {
            steps {
                // Simulate a build step
                echo 'Building the project...'
                sh 'echo "Build completed!" > build.log'
                echo 'Build completed!'
            }
        }
        stage('Test') {
            steps {
                // Simulate running tests
                echo 'Running tests...'
                sh 'echo "All tests passed!" > test-results.log'
                echo 'Tests completed successfully!'
            }
        }
        stage('Deploy') {
            steps {
                // Simulate a deployment
                echo 'Deploying the application...'
                sh 'echo "Deployment successful!" > deploy.log'
                echo 'Application deployed successfully!'
            }
        }
    }
    post {
        always {
            // Archive all logs for future reference
            archiveArtifacts artifacts: '*.log', fingerprint: true
            echo 'All logs have been archived.'
        }
    }
}
