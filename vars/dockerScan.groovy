def call(String imageName) {
    echo "🔐 Scanning Docker image for vulnerabilities: ${imageName}"
    
    // Example using Trivy
    sh """
        trivy image --exit-code 1 --severity CRITICAL,HIGH ${imageName}
    """
}
