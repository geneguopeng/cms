package com.util

import org.grails.plugins.excelimport.AbstractExcelImporter
import org.grails.plugins.excelimport.ExcelImportService

/**
 * Created with IntelliJ IDEA.
 * User: Dbb
 * Date: 14-3-12
 * Time: 上午10:51
 * To change this template use File | Settings | File Templates.
 */
class ExcelImporter extends AbstractExcelImporter {
    public ExcelImporter(fileName) {
        super(fileName)
    }

    def getExcelImportService() {
        ExcelImportService.getService()
    }

    static Map CONFIG_PROP_COLUMN_MAP = [
            sheet:'cme_question_prop_define',
            startRow: 1,
            columnMap:  [
                    'A':'name',
                    'B':'value',
                    'C':'type'
            ]
    ]

    List<Map> getProp() {
        List propList = excelImportService.columns(workbook, CONFIG_PROP_COLUMN_MAP)
    }

    static Map CONFIG_RESOURCE_COLUMN_MAP = [
            sheet:'cme_security_resource',
            startRow: 1,
            columnMap:  [
                    'A':'url',
                    'B':'actionMask',
                    'C':'name'
            ]
    ]

    List<Map> getResource() {
        List groupList = excelImportService.columns(workbook, CONFIG_RESOURCE_COLUMN_MAP)
    }

    static Map CONFIG_GROUP_COLUMN_MAP = [
            sheet:'cme_group',
            startRow: 1,
            columnMap:  [
                    'A':'parent',
                    'B':'name'
            ]
    ]

    List<Map> getGroups() {
        List groupList = excelImportService.columns(workbook, CONFIG_GROUP_COLUMN_MAP)
    }

    static Map CONFIG_USER_COLUMN_MAP = [
            sheet:'cme_user',
            startRow: 1,
            columnMap:  [
                    'A':'name',
                    'B':'sn'
            ]
    ]

    List<Map> getUsers() {
        List groupList = excelImportService.columns(workbook, CONFIG_USER_COLUMN_MAP)
    }

    static Map CONFIG_ROLE_COLUMN_MAP = [
            sheet:'cme_security_role',
            startRow: 1,
            columnMap:  [
                    'A':'name',
                    'B':'memo',
                    'C':'resources'
            ]
    ]

    List<Map> getRoles() {
        List roleList = excelImportService.columns(workbook, CONFIG_ROLE_COLUMN_MAP)
    }



}
