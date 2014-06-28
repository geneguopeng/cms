package cme.entity.questionpool

class QuestionStat {
    long questionId
    float difficulty
    float discrimination
    long testPaperReferedTimes
    long answerPaperReferedTimes
    long doTimes
    long doCorrectTimes
    int averageDoTime


    static constraints = {
    }
}
