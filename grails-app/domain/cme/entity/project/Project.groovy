package cme.entity.project

import cme.entity.questionpool.QuestionPool

class Project {
    String name
    String departmentName
    String orgCode = "drcl"
    QuestionPool pool

    static  hasMany = [admins : ProjectManager]

    static constraints = {
    }
}
