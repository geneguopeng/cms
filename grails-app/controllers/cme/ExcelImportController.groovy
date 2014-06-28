package cme

import org.grails.plugins.excelimport.AbstractExcelImporter
import org.grails.plugins.excelimport.ExcelImportService

class ExcelImportController extends AbstractExcelImporter{
    public BookExcelImporter(fileName) {
        super.read(fileName)
    }
    static Map CONFIG_BOOK_CELL_MAP = [
            sheet:'Sheet2',
            cellMap: [ 'D3':'title',
                    'D4':'author',
                    'D6':'numSold',
            ]
    ]

    static Map CONFIG_BOOK_COLUMN_MAP = [
            sheet:'Sheet1',
            startRow: 2,
            columnMap:  [
                    'B':'title',
                    'C':'author',
                    'D':'numSold',
            ]
    ]

    //can also configure injection in resources.groovy
    def getExcelImportService() {
        ExcelImportService.getService()
    }

    List<Map> getBooks() {
        List bookList = excelImportService.columns(workbook, CONFIG_BOOK_COLUMN_MAP)
    }


    Map getOneMoreBookParams() {
        Map bookParams = excelImportService.cells(workbook, CONFIG_BOOK_CELL_MAP )
    }
}
