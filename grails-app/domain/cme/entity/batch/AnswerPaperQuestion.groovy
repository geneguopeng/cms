package cme.entity.batch

import cme.entity.questionpool.Question
import cme.entity.user.User

class AnswerPaperQuestion {
    BatchUser user
    AnswerPaper paper
    Question question
    String answer
    String markComment
    boolean marked
    Date markTime
    float score
    User markBy
    float totalScore
    String scoreDetail

    static mapping = {
        user column: "cme_batch_user_id"
        paper column: "cme_answer_paper_id"
        question column: "cme_question_id"
    }

    static constraints = {
    }
}
