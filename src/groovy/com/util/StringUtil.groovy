package com.util
/**
 * Created with IntelliJ IDEA.
 * User: Dbb
 * Date: 14-3-18
 * Time: 下午4:09
 * To change this template use File | Settings | File Templates.
 */
class StringUtil {
    static splitStringToIntList(String str) {
        List<Integer> rtn = new ArrayList<Integer>()
        str.split("," ).each {
            rtn.addAll(praseLine(it))
        }
        rtn
    }

    static praseLine(String str) {
        List<Integer> ints = new ArrayList<Integer>()
        if (str.indexOf("-") != -1) {
            def begin = str.substring(0, str.indexOf("-")).toInteger()
            def end = str.substring(str.indexOf("-") + 1).toInteger()
            for(; begin <= end; begin++)  {
                ints.add(begin)
            }
        } else {
            ints.add(str.toInteger())
        }
        ints
    }

}
