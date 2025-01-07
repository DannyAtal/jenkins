pipeline {
    agent any
    stages {
        stage('Clean Workspace') {
            steps {
                script {
                    // Clean workspace to start fresh
                    cleanWs()
                }
            }
        }
        stage('Clone Repository') {
            steps {
                script {
                    // Clone the repository using shell commands
                    sh '''
                        git clone -b dev https://github.com/shomronh/certis.git
                    '''
                }
            }
        }
    //     stage('Build') {
    //         steps {
    //             script {
    //                 // Simulate a build step
    //                 echo 'Building the project...'
    //                 sh 'echo "Build completed!" > build.log'
    //             }
    //         }
    //     }
    //     stage('Test') {
    //         steps {
    //             script {
    //                 // Simulate running tests
    //                 echo 'Running tests...'
    //                 sh 'echo "All tests passed!" > test-results.log'
    //             }
    //         }
    //     }
    //     stage('Deploy') {
    //         steps {
    //             script {
    //                 // Simulate a deployment
    //                 echo 'Deploying the application...'
    //                 sh 'echo "Deployment successful!" > deploy.log'
    //             }
    //         }
    //     }
    // }
    // post {
    //     always {
    //         script {
    //             // Archive all logs for future reference
    //             archiveArtifacts artifacts: '*.log', fingerprint: true
    //         }
    //     }
    // }
}
}
