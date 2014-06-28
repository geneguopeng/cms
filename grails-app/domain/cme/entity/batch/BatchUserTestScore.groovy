package cme.entity.batch

class BatchUserTestScore {
    BatchUser user
    BatchTest test
    float score
    int paperNum

    static mapping = {
        user column: "cme_batch_user_id"
        test column: "cme_batch_test_id"
    }

    static constraints = {
    }
}
