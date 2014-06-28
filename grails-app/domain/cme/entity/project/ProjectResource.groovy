package cme.entity.project

import cme.entity.user.User

class ProjectResource {
    int resourceType
    int platformType
    User uploadBy
    Date uploadTime
    Project project
    String originalFileName
    String originalFilePath
    String currentFilePath
    String resourceProps
    boolean referFlag
    int convertStatus
    String customFileName

    static mapping = {
        project column: "cme_project_id"
    }

    static constraints = {
    }
}
