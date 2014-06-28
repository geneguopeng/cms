package cme.entity.questionpool

import cme.entity.user.User

class Question {
    int version = 1
    long questionId
    QuestionPool pool
    QuestionCatalog catalog
    boolean currentVersionFlag = true
    String questionDesc
    String questionAnalyze
    int usageType
    long questionType
    int difficultyType
    int abilityType
    boolean markFlag = false
    boolean disableFlag = false
    boolean deleteFlag = false
    User createUser
    Date createTime = new Date()
    User lastUpdateBy
    Date lastUpdateTime = new Date()
    Question parent
    float weight = 0
    boolean needNewVersion = false
    String code

    static hasMany = [optionSet : QuestionOptions, childQuestions : Question, optionsList : QuestionOptions]

    static mapping = {
        pool column: "cme_question_pool_id"
        catalog column: "cme_question_catalog_id"
        pool column: "cme_question_pool_id"
    }

    static constraints = {
    }
}
