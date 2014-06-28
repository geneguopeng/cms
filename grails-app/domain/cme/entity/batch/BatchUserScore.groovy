package cme.entity.batch

class BatchUserScore {
    BatchUser user
    float score
    Date generateTime

    static mapping = {
        user column: "cme_batch_user_id"
    }

        static constraints = {
    }
}
