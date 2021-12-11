pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'This is building phase'
            }
        }
         stage('Testing') {
            steps {
                echo 'This is testing phase'
            }
        }
        stage('Deploying') {
            steps {
                echo 'This is deploying phase'
            }
        }
    }
    post
        {
            always
            {
                emailext body: 'This is test email', subject: 'Build Status', to: 'mishra.ankur671@gmail.com'
            }
        }
}
