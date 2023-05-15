node {
    stage('Pull') {
        echo 'hello world'
    }
    stage('build') {
        echo 'build success'
    }
    stage('Test') {
        echo 'test done'
    }
    stage('deploy') {
        echo 'deploy work'
    }
}