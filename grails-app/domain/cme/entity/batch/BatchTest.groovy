package cme.entity.batch

class BatchTest {
    String name
    Batch batch
    int timeType
    int testTime
    int submitType
    int submitTimes
    boolean endOnStartFlag
    int showType
    boolean delflag
    int scoreType
    int openType
    Date openStartTime
    Date openEndTime
    boolean codeflag
    BatchPaperRule rule

    static hasMany = [restrictions : BatchTestRestriction]

    static mappedBy = [restrictions: "test"]

    static mapping = {
        batch column: "cme_batch_id"
    }

    static constraints = {
    }
}
