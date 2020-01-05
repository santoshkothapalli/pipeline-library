def call(String command='sh') {
    echo "INFO: Executing the maven clean with ${command}"
    ${command} "mvn -Dmaven.test.failure.ignore=true clean package"
}