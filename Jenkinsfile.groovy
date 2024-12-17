pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                bat 'newman run "./PetStoreUser.postman_collection.json"'
            }
        }
    }
}
