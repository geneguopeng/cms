package cme.entity.user
import cme.IConstant

class User {
    String orgCode = IConstant.ORG_CODE
    String sn
    String name
    String userId = ""
    String additionalInfo = ""
    boolean delflag = false

    static constraints = {
    }

    static def importFromList(List<Map> lists) {
        lists.each {Map params->
            def user = new User(params)
            user.save(flush: true)
            println user.dump()
        }
        User.count()
    }
}