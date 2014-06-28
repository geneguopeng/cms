package cme.entity.batch

class BatchResourceCatalog {
    Batch batch
    String name
    BatchResourceCatalog parent
    String descs
    String keywords
    int seq
    Integer platformType


    static mapping = {
        batch column: "cme_batch_id"
    }

    static hasMany = [childs : BatchResourceCatalog, platformResources : BatchResource, mobileResources : BatchResource]

    static constraints = {
    }
}
