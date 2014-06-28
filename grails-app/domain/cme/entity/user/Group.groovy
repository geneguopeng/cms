package cme.entity.user

import cme.IConstant

class Group {
    String name
    int groupType = 1
    String orgCode = IConstant.ORG_CODE
    String groupId = ""
    Group parent = null
    boolean deleted = false

    static hasMany = [children : Group]

    static constraints = {
    }

    static mapping = {
        deleted type: "yes_no"
    }

    static def importFromList(List<Map> groups) {
        groups.each {Map params->
            Group parent = Group.findByName(params.get("parent"))
            def group = new Group(parent:parent, name:params.get("name"))
            group.save(flush: true)
        }
        Group.count()
    }
}
