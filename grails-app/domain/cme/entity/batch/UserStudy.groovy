package cme.entity.batch

class UserStudy {
    BatchUser user
    BatchResourceCatalog resourceCatalog
    int studyTime

    static mapping = {
        user column: "cme_batch_user_id"
        resourceCatalog column: "cme_batch_resource_catalog_id"
    }

    static constraints = {
    }
}
