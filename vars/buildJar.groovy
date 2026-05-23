#!usr/bin/env groovy
def call(){
    echo 'Building Jar File ... '
    sh 'mvn -f maven-demo/pom.xml package'
}