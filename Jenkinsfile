@Library('mvn_shared_lib') _
pipeline{

    agent any

    stages {

        stage ('Git checkout'){
            steps{
                script{
                    gitCheckout(
                        branch: "master",
                        url: "https://github.com/ced-ktc/multiapps.git"
                    )
                }
            }
            
        }
        
        stage ('Unit testing maven'){
            steps{
                script{
                    mvnTest()
                }
            }
            
        }

        stage ('Integration testing maven'){
            steps{
                script{
                    mvnIntegrationTest()
                }
            }
            
        }
    }


}