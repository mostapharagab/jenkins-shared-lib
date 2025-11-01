// src/org/mylib/DockerUtils.groovy
package org.mylib

class DockerUtils {
    static void login(String user, String pass) {
        sh "echo ${pass} | docker login -u ${user} --password-stdin"
    }
}

