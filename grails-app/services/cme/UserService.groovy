package cme

import cme.entity.batch.Batch
import cme.entity.user.User

class UserService {

    def  addUser(Batch batch, User user) {


    }

    def studyResource() {
        //TODO: 学习资源
    }

    def answerPaper(Batch batch, User user) {
        //TODO: 做测试
    }

    def practiceQuestion(Batch batch, User user) {
        //TODO: 做练习
    }

    def stats() {
        //TODO: 统计信息
    }

    def createUser(Map map) {
        User user = new User(map)
        return user.save(flush: true)
    }
}
