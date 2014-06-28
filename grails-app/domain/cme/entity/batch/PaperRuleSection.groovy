package cme.entity.batch

class PaperRuleSection {
    long questionType
    int questionNum
    float questionScore
    int seq
    BatchPaperRule rule


    static mapping = {
        rule column: "cme_batch_paper_rule_id"
    }

    static hasMany = [catalogs : RuleSectionCatalog]

    static constraints = {
    }
}
