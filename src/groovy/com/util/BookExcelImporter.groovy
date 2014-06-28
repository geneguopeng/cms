package com.util

import org.grails.plugins.excelimport.AbstractExcelImporter
import org.grails.plugins.excelimport.ExcelImportService

/**
 * Created with IntelliJ IDEA.
 * User: Dbb
 * Date: 14-3-5
 * Time: 下午4:40
 * To change this template use File | Settings | File Templates.
 */
class BookExcelImporter extends AbstractExcelImporter {

    public BookExcelImporter(fileName) {
        super(fileName)
    }

    static Map CONFIG_BOOK_CELL_MAP = [
            sheet:'Sheet1',
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
