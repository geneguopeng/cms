package cme.entity.batch

import cme.entity.questionpool.Question

class PaperQuestion {
    Paper paper
    PaperSection section
    Question question
    float score
    int seq

    static mapping = {
        paper column: "cme_paper_id"
        section column: "cme_paper_section_id"
        question column: "cme_question_id"
    }

    static constraints = {
    }
}
