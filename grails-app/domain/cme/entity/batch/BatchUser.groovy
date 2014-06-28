package cme.entity.batch

import cme.entity.user.User

class BatchUser {
    Batch batch
    User user
    Date addTime
    boolean studyFlag
    boolean practiceFlag
    boolean testFlag
    int practiceNum
    int practiceSeconds
    boolean delFlag = false

    static mapping = {
        user column: "cme_user_id"
        batch column: "cme_batch_id"
    }

    static constraints = {
    }
}
