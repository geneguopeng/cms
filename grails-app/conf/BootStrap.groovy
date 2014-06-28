import cme.entity.security.Resource
import cme.entity.user.Group
import cme.entity.user.User
import com.util.ExcelImporter

class BootStrap {

    def init = { servletContext ->
        String fileName = "./grails-app/conf/data.xlsx"
        ExcelImporter importer = new ExcelImporter(fileName);
        //导入机构
//        def groupList = importer.getGroups()
//        println Group.importFromList(groupList)
        //导入资源
//        def resourceList = importer.getResource()
//        println Resource.importFromList(resourceList)
        //导入用户
        def userList = importer.getUsers()
        println User.importFromList(userList)

    }
    def destroy = {
    }
}
