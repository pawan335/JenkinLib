def call(String project = 'YourProject.csproj', String output = 'publish') {
    stage('Publish') {
        bat "dotnet publish ${project} --configuration Release --output ${output}"
    }
}