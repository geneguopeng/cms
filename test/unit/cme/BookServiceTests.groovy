package cme
import com.util.BookExcelImporter
import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class BookServiceTests {

    void testSomething() {
        String fileName = "./test/unit/test-databooks.xls"
        BookExcelImporter importer = new BookExcelImporter(fileName);
        def booksMapList = importer.getBooks();
        println booksMapList.dump()
//        println importer.getOneMoreBookParams();
//        booksMapList.each { Map bookParams ->
//            def newBook = new Book(bookParams)
//            if (!newBook.save()) {
//                println "Book not saved, errors = ${newBook.errors}"
//            }
//        }
//
//        new Book(importer.getOneMoreBookParams()).save()
    }
}
