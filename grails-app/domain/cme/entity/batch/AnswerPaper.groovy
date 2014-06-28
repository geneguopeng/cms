package cme.entity.batch

import cme.entity.user.User

class AnswerPaper {
    BatchUser user
    BatchTest test
    Paper paper
    Date submitTime
    Date startTime
    int submitTimes
    boolean marked
    Date markTime
    User markUser
    float score
    boolean scorePublished
    boolean finished

    static mapping = {
        user column: "cme_batch_user_id"
        test column: "cme_batch_test_id"
    }

    static constraints = {
    }
}
