package cme.entity.project

import cme.entity.user.User

class ProjectManager {
    Project project
    User user

    static mapping = {
        user column:"cme_user_id"
        project column: "cme_project_id"
    }

    static constraints = {
    }
}
