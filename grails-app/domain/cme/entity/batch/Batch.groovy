package cme.entity.batch

import cme.entity.project.Project

class Batch {
    String name
    Project project
    Date startTime
    Date endTime
    int openStatus

    static mapping = {
        project column: "cme_project_id"
    }

    static hasMany = [settings : BatchModuleSetting]

    static constraints = {
    }
}
