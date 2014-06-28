package cme

import cme.entity.project.Project
import cme.entity.questionpool.QuestionPool

class ProjectService {

    def createProject(Map params) {
        Project project = new Project(params)
    }

    def createBatch() {
        //TODO: 创建批次
    }

    def addSource() {
        //TODO: 添加资源
    }

    def addQuestionsPool(QuestionPool questionPool) {
        //TODO: 添加题库
    }
}
