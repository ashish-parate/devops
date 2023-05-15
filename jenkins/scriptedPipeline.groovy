node {
    stages('Pull') {
        echo 'hello world'
    }
    stages('build') {
        echo 'build success'
    }
    stages('Test') {
        echo 'test done'
    }
    stages('deploy') {
        echo 'deploy work'
    }
}