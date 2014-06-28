package cme.entity.questionpool

import cme.entity.security.Permission
import cme.entity.security.Resource
import cme.entity.security.Role
import com.util.ExcelImporter
import grails.test.mixin.Mock
import grails.test.mixin.TestFor
/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(QuestionPropDefine)
@Mock([QuestionPropDefine, Resource, Role, Permission])
class QuestionPropDefineTests {

    String fileName = "./grails-app/conf/data.xlsx"
    ExcelImporter importer
    void setUp() {
        importer = new ExcelImporter(fileName);
    }

    void testPropImport() {
        def props = importer.getProp()
        QuestionPropDefine.importFromList(props)
        assert QuestionPropDefine.count == 14
        assert QuestionPropDefine.countByType(1) == 5
        assert QuestionPropDefine.countByType(2) == 3
        assert QuestionPropDefine.countByType(3) == 6
    }

    void testResourceImport() {
        def resources = importer.getResource()
        Resource.importFromList(resources)
        assert Resource.count == 53
    }

    void testRoleImport() {
        def roles = importer.getRoles()
        Role.importFromList(roles)
        assert Role.count == 7
        assert Permission.count == 118
    }
}
