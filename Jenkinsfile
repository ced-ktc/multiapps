@Library('mvn_shared_lib') _
pipeline{

    agent any

    stages {

        stage ('Git checkout'){

            script{
                gitCheckout(
                    branch: "master",
                    url: "https://github.com/ced-ktc/multiapps.git"
                )
            }
        }

    }


}