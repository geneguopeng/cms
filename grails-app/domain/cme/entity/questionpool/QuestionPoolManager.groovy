package cme.entity.questionpool

import cme.entity.user.User

class QuestionPoolManager {
    long poolId
    User user

    static mapping = {
        user column: "cme_user_id"
    }
    static constraints = {
    }
}
