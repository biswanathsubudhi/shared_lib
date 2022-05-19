def call(envt,user_name,ip) {
  sshagent(['envt']) {
       sh 'scp -o StrictHostKeyChecking=no target/myweb.war $user_name@$ip:/software/tomcat-9/webapps/'
       sh 'ssh $user_name@$ip /software/tomcat-9/bin/shutdown.sh'
       sh 'ssh $user_name@$ip /software/tomcat-9/bin/startup.sh'
      }
   }
