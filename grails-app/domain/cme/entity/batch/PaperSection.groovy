package cme.entity.batch

class PaperSection {
    Paper paper
    int questionNums
    float questionScore
    int seq
    long questionType

    static mapping = {
        paper column: "cme_paper_id"
    }

    static constraints = {
    }
}
