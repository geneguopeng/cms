package cme

import cme.entity.project.Project
import cme.entity.questionpool.QuestionPool

class QuestionService {

    def createQuestion() {
        //TODO: 创建题目
    }

    def importQuestions(QuestionPool questionPool, String filePath) {
        //TODO: 导入题目
    }

    def exportQuestion() {
        //TODO: 导出题目
    }

    def categoryQuestions() {
        //TODO: 题目归类
    }

    def snapshot() {
        //TODO: 版本镜像
    }

    def createQuestionPool(Project project, String name) {
        QuestionPool questionPool = new QuestionPool(project: project, name: name)
        return questionPool.save(flush: true)
    }
}
