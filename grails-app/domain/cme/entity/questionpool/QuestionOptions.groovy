package cme.entity.questionpool

class QuestionOptions {
    String optionContent
    Question question
    boolean answerflag = true
    int seq
    boolean enumflag = false
    float weight = 0
    boolean scoreEachFlag = false

    static mapping = {
        question column: "cme_question_id"
    }

    static constraints = {
    }
}
