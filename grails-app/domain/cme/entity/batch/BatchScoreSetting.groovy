package cme.entity.batch

class BatchScoreSetting {
    Batch batch
    float excellentLevel
    float totalScore
    float qualifiedLevel
    int levelStandand

    static mapping = {
        batch column: "cme_batch_id"
    }

    static hasMany = [items : BatchScoreSettingItem]

    static constraints = {
    }
}
