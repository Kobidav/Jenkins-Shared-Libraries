def call(String imageName, String testCommand = 'pytest') {
    echo "🧪 Running tests in Docker container for image: ${imageName}"
    sh """
        docker run --rm ${imageName} ${testCommand}
    """
}
