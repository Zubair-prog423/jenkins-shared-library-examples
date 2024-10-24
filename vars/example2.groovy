def call(String saywhat = "nothing") {
    if (saywhat == "hi") {
        script {
            sh """
                echo Hi Alice
            """
        }
    } else if (saywhat == "hello") {
        script {
            sh """
                echo Hello Alice
            """
        }
    } else {
        script {
            sh """
                echo hello this is mohd zubairkhan
                and what rae doing right now
            """
        }
    }
}

