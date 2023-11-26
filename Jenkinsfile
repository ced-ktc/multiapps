@Library('mvn_shared_lib') _
pipeline{

    agent any

    parameters{
        choice(name: 'action', choices: 'create\ndelete', description: 'Choose create/delete')
    }

    stages {
        stage ('Git checkout'){
            when{expression {params.action == 'create'}}
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
            when{expression {params.action == 'create'}}
            steps{
                script{
                    mvnTest()
                }
            }
            
        }
        
        stage ('Integration testing maven'){
            when{expression {params.action == 'create'}}
            steps{
                script{
                    mvnIntegrationTest()
                }
            }
            
        }
        
        stage ('Static code analysis: Sonarqube'){
            when{expression {params.action == 'create'}}
            steps{
                script{
                    def sonarQubeCredentialsID = 'sonar-multiapp'
                    staticCodeAnalysis(sonarQubeCredentialsID)
                }
            }
            
        }
        
        stage ('Quality gate status check: Sonarqube'){
            when{expression {params.action == 'create'}}
            steps{
                script{
                    def sonarQubeCredentialsID = 'sonar-multiapp'
                    qualityGateStatus(sonarQubeCredentialsID)
                }
            }
            
        }
    }


}