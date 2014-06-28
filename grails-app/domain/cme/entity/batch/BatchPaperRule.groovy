package cme.entity.batch

class BatchPaperRule {
    Batch batch
    BatchTest test
    float totalScore
    float excellentLevel
    float qualifiedLevel
    int questionSeqType
    int optionSeqType
    int paperNum
    boolean wrongFlag

    static mapping = {
        batch column: "cme_batch_id"
        test column: "cme_batch_test_id"
    }

    static hasMany = [sections : PaperRuleSection]

    static constraints = {
    }
}
