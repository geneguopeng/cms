package cme.entity.batch

class BatchTestRestriction {

    BatchTest test
    BatchTest conditionTest
    int opType
    float compareScoreStart
    float compareScoreEnd
    int restrictionType

    static mapping = {
        test column: "cme_batch_test_id"
        conditionTest column: "condition_test_id"
    }

    static constraints = {
    }
}
