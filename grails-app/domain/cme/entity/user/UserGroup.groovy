package cme.entity.user

class UserGroup {
    User user
    Group group
    int role
    Date createTime = new Date()

    static mapping = {
        user column:"cme_user_id"
        group column: "cme_group_id"
    }

    static constraints = {
    }
}
