multibranchPipelineJob('Multi_Job_Test') {
    branchSources {
        git {
            remote('https://github.com/shashi193/multibranch_workflow.git')
          
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
