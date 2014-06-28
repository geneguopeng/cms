package cme.entity.batch

class BatchQuestionPool {
    Batch batch
    int poolType
    long poolId
    long catalogId
    boolean catalogFlag = false
    String name

    static mapping = {
        batch column: "cme_batch_id"
    }

    static constraints = {
    }
}
