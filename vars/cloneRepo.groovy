def call(String url, String branch){
  echo 'Started cloning the code.'
  git url: "${url}", branch: "${branch}"
  echo 'Code cloning successfull.'
}
