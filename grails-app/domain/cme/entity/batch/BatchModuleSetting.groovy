package cme.entity.batch

class BatchModuleSetting {
    Batch batch
    int moduleId
    int moduleStatus

    static mapping = {
        batch column: "cme_batch_id"
    }

    static constraints = {
    }
}
