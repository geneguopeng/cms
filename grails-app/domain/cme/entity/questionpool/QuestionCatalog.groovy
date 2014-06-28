package cme.entity.questionpool

class QuestionCatalog {
    String name
    QuestionCatalog parent
    QuestionPool pool
    boolean  delflag

    static hasMany = [children : QuestionCatalog]

    static mapping = {
        pool column: "cme_question_pool_id"
    }

    static constraints = {
    }
}
