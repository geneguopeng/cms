package cme.entity.batch

import cme.entity.user.User

class TestCode {
    BatchTest test
    String code
    Date genTime
    Date validTo
    User genBy

    static mapping = {
        test column: "cme_batch_test_id"
        genBy column: "cme_user_id"
    }

    static constraints = {
    }
}
