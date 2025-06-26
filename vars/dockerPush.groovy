def call(String credentialId){
  withCredentials([usernamePassword(credentialsId: "${credentialId}", passwordVariable:"username" , usernameVariable:"password")]){
    sh "docker login -u ${env.username} -p ${env.password}"
  
  }
}
