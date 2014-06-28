package cme.entity.security

class Permission {
    Resource resource
    int permission = 0
    Role role

    static mapping = {
        table name: "cme_security_permission"
        resource column: "cme_security_resource_id"
        role column: "cme_security_role_id"
    }

    static constraints = {
    }
}
