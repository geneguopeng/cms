package cme.entity.batch

class Paper {
    BatchPaperRule rule
    Date genTime
    float totalScore
    int questionSeqType
    int optionSeqType
    boolean usedFlag
    int usedTimes
    boolean validFlag
    int showType
    int timeType
    int testTime
    String detail
    boolean needMark = false

    static mapping = {
        rule column: "cme_batch_paper_rule_id"
    }


    static constraints = {
    }
}
