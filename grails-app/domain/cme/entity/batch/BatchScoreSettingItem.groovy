package cme.entity.batch

class BatchScoreSettingItem {
    BatchScoreSetting setting
    float weight
    BatchTest test

    static mapping = {
        setting column: "cme_batch_score_setting_id"
        test column: "cme_batch_test_id"
    }

    static constraints = {
    }
}
