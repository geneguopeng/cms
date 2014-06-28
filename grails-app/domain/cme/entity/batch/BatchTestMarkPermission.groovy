package cme.entity.batch

import cme.entity.user.Group
import cme.entity.user.User

class BatchTestMarkPermission {
    BatchTest test
    User user
    Group group
    Date settingTime

    static mapping = {
        user column: "cme_user_id"
        test column: "cme_batch_test_id"
        group column: "cme_group_id"
    }

    static constraints = {
    }
}
