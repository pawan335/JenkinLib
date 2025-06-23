def call(String testProjectPath = '.\\tests') {
    stage('Test') {
         sh "dotnet test ${testProjectPath} --configuration Release"
    }
}