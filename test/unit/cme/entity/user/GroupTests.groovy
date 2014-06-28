package cme.entity.user

import grails.test.mixin.TestFor
/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Group)
class GroupTests {

    void testCreateGroup() {
        def group = new Group(name: "RootGroup")
        println group.dump()
        if (group.save(flush: true)) {
            println group.dump()
        } else {
            fail "Save Fail"
        }
    }
}
