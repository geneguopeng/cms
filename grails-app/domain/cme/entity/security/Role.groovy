package cme.entity.security

import com.util.StringUtil

class Role {
    String name
    String memo

    static  hasMany = [permissions:Permission]

    static mapping = {
        table name: "cme_security_role"
    }

    static constraints = {
    }

    static def importFromList(List<Map> lists) {
        lists.each {Map params->
            def role = new Role(params)
            def resourcesString = params.get("resources")
            def resources = StringUtil.splitStringToIntList(resourcesString)
            resources.each {
                role.addToPermissions(new Permission(role: role, resource: Resource.findById(it)))
            }
            role.save(flush: true)
        }
        Resource.count()
    }
}
