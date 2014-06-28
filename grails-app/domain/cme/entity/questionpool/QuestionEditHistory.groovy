package cme.entity.questionpool

import cme.entity.user.User

class QuestionEditHistory {
    QuestionPool pool
    long questionId
    User updateUser
    Date updateTime
    long oldId
    long newId
    int opType

    static mapping = {
        pool column: "cme_question_pool_id"
    }

    static constraints = {
    }
}
