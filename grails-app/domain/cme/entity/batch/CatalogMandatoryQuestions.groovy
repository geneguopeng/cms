package cme.entity.batch

import cme.entity.questionpool.Question

class CatalogMandatoryQuestions {
    RuleSectionCatalog catalog
    Question question

    static mapping = {
        catalog column: "cme_rule_section_catalog_id"
        question column: "cme_question_id"
    }

    static constraints = {
    }
}
