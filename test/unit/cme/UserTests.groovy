package cme

import cme.entity.user.Group
import cme.entity.user.User
import com.util.ExcelImporter
import grails.test.mixin.Mock
import grails.test.mixin.TestFor
/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestFor(User)
@Mock([User, Group])
class UserTests {
    String fileName = "./grails-app/conf/data.xlsx"
    ExcelImporter importer
    void setUp() {
        importer = new ExcelImporter(fileName);
    }

    void tearDown() {
        // Tear down logic here
    }

    void testImportUser() {
        def entitys = importer.getUsers()
        User.importFromList(entitys)
        assert User.count == 2
        def users1 = User.findByName("Admin")
        assert users1.sn == "a00001"
        def users2 = User.findByName("Manager")
        assert users2.sn == "a999999"
    }

    void testImportGroup() {
        def entitys = importer.getGroups()
        Group.importFromList(entitys)
        assert Group.count == 65
    }



}
