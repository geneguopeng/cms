package cme.entity.batch

class UserStudyHistory {
    BatchUser user
    Date lastStudyTime
    int studyTime
    BatchResourceCatalog catalog
    BatchResource resource
    int breakPoint

    static mapping = {
        user column: "cme_batch_user_id"
        catalog column: "cme_batch_resource_catalog_id"
        resource column: "cme_batch_resource_id"
    }

    static constraints = {
    }
}
