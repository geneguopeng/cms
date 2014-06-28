package cme.entity.questionpool

import cme.IConstant

class QuestionPropDefine {
    String orgCode = IConstant.ORG_CODE
    String name
    int value
    int type
    boolean fixed = false

    static constraints = {
    }

    static mapping = {
        fixed type: "yes_no",column: "sys_flag"
    }

    static def importFromList(List<Map> lists) {
        lists.each {Map params->
            def prop = new QuestionPropDefine(params)
            prop.save(flush: true)
        }
        QuestionPropDefine.count()
    }

}
