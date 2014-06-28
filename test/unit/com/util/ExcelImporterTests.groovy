package com.util
import cme.entity.user.Group
import grails.test.mixin.Mock
import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
@Mock(Group)
class ExcelImporterTests {

    void setUp() {
        // Setup logic here
    }

    void tearDown() {
        // Tear down logic here
    }

    void testSomething() {
        String fileName = "./grails-app/conf/data.xlsx"
        ExcelImporter importer = new ExcelImporter(fileName);
        def mapList = importer.getGroups()
        println mapList.dump()
        mapList.each {Map params->
            println params
            Group parent = Group.findByName(params.get("parent"))
            def group = new Group(parent:parent, name:params.get("name"))
            println group.dump()
            group.save(flush: true)
        }
    }
}
