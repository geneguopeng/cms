package cme.entity.batch

import cme.entity.project.ProjectResource

class BatchResource {
    Batch batch
    BatchResourceCatalog catalog
    Integer seq
    ProjectResource resource
    Integer platformType

    static mapping = {
        batch column: "cme_batch_id"
        catalog column: "cme_batch_resource_catalog_id"
        resource column: "cme_project_resource_id"
    }
    static constraints = {
    }
}
