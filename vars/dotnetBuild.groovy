def call(String solution = 'YourSolution.sln') {
    stage('Build') {
        sh "dotnet build ${solution} --configuration Release"
    }
}