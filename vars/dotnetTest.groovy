def call(String testProjectPath = '.\\tests') {
    stage('Test') {
        bat "dotnet test ${testProjectPath} --configuration Release"
    }
}