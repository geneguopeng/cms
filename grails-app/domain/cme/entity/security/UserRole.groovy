package cme.entity.security

import cme.entity.user.User

class UserRole {
    User user
    Role role

    static mapping = {
        table name: "cme_security_user_role"
        user column: "cme_user_id"
        role column: "cme_security_role_id"
    }

    static constraints = {
    }
}
