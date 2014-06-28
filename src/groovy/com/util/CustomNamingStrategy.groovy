package com.util
import org.hibernate.cfg.ImprovedNamingStrategy
/**
 * Created with IntelliJ IDEA.
 * User: Dbb
 * Date: 14-3-3
 * Time: 下午3:54
 * To change this template use File | Settings | File Templates.
 */
class CustomNamingStrategy extends ImprovedNamingStrategy{
    String classToTableName(String className) {
        return "cme_" + super.classToTableName(className)
    }

}
