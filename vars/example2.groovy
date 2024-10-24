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
                echo this is mohd zubair khan
                what are you doing right now
            """
        }
    }
}

