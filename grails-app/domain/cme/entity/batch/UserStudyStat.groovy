package cme.entity.batch

class UserStudyStat {
    BatchUser user
    float coverRate
    int times
    int totalTime

    static mapping = {
        user column: "cme_batch_user_id"
    }

    static constraints = {
    }
}
