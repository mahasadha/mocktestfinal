pipeline {
    agent any
    
    environment {
        // Define environment variables if needed
    }
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code from your version control system (e.g., Git)
                git 'your_repository_url'
            }
        }
        
        stage('Build and Test') {
            steps {
                // Install necessary dependencies and execute Cucumber tests
                script {
                    // Set up ChromeDriver path
                    def chromedriverPath = "C:\\Users\\vignesh\\Downloads\\chromedriver-win64\\chromedriver.exe"
                    
                    // Set system property for ChromeDriver
                    System.setProperty("webdriver.chrome.driver", chromedriverPath)
                    
                    // Execute Cucumber tests with scenario outlines
                    sh 'mvn clean test -Dcucumber.options="--tags @UserLogin"'
                }
            }
        }
    }
    
  
