pipeline {
    agent any
    
        environment {
    PATH = "C:\\WINDOWS\\SYSTEM32; C:\\Users\\vignesh\\apache-maven-3.9.6\\bin"
    JAVA_HOME='C:\\Program Files\\Java\\jdk-17'
        }
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code from your version control system (e.g., Git)
                git 'https://github.com/mahasadha/mocktestfinal.git'
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
}
  
