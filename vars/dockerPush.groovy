def call(String credentialId){
  withCredentials([usernamePassword(credentialsId: "${credentialId}", passwordVariable:"password" , usernameVariable:"username")]){
    sh "docker login -u ${env.username} -p ${env.password}"
  
  }
}
