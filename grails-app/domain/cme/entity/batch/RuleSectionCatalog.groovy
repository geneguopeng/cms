package cme.entity.batch

class RuleSectionCatalog {
    PaperRuleSection section
    int questionNum
    int poolType
    long catalogId
    long poolId
    boolean catalogFlag

    static mapping = {
        section column: "cme_paper_rule_section_id"
    }

    static constraints = {
    }
}
