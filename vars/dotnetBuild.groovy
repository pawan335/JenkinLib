def call(String solution = 'YourSolution.sln') {
    stage('Build') {
        bat "dotnet build ${solution} --configuration Release"
    }
}