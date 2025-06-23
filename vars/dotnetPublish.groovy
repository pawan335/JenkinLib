def call(String project = 'YourProject.csproj', String output = 'publish') {
    stage('Publish') {
         sh "dotnet publish ${project} --configuration Release --output ${output}"
    }
}