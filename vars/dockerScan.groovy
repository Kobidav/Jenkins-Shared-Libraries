def call(String imageName) {
    echo "🔐 Scanning Docker image for vulnerabilities: ${imageName}"
    
    // Example using Trivy
    sh """
        if ! command -v trivy &> /dev/null; then
            echo 'Installing Trivy...'
            curl -sfL https://raw.githubusercontent.com/aquasecurity/trivy/main/contrib/install.sh | sh -s -- -b /usr/local/bin
        fi
        trivy image --exit-code 1 --severity CRITICAL,HIGH ${imageName}
    """
}
