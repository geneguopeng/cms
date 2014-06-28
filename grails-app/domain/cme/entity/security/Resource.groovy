package cme.entity.security

class Resource {
    String url
    int actionMask
    String name
    String memo = ""

    static mapping = {
        table name: "cme_security_resource"
    }

    static constraints = {
    }

    static def importFromList(List<Map> lists) {
        lists.each {Map params->
            def resource = new Resource(params)
            resource.save(flush: true)
        }
        Resource.count()
    }

}
