package cme.entity.security

import cme.entity.user.User

/**
 * Created with IntelliJ IDEA.
 * User: Dbb
 * Date: 14-3-6
 * Time: 下午4:04
 * To change this template use File | Settings | File Templates.
 */
class   UserLogin {
    User user
    String name
    String passwd
    int status
    Date freezeStartTime
    Date freezeEndTime

    static mapping = {
        table name: "cme_security_user_login"
        user: "cme_user_id"
    }

    static constraints = {
    }
}
