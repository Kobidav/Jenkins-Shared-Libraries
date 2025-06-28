def call(String imageName, String dockerfile = 'Dockerfile') {
    echo "🔨 Building Docker image: ${imageName}"
    sh "docker build -t ${imageName} -f ${dockerfile} ."
}
