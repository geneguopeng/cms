dataSource {
    pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    username = "root"
    password = "admin"
//    dbCreate = "update"
//    url = "jdbc:mysql://localhost/gcme"
    dbunitXmlType = "structured" // dbunit-operator data file type: 'flat' or 'structured'
    orderTables = true // resolve table dependencies and order tables? (if true: dbunit-operator is slower)
//    logSql = true

}
hibernate {
    cache.use_second_level_cache = false
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
    naming_strategy = com.util.CustomNamingStrategy
}
// environment specific settings
environments {
    development {
        dataSource {
//            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
//            url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000"

//            pooled = false
            dbCreate = "create-drop"
            driverClassName = "com.mysql.jdbc.Driver"
            url = "jdbc:mysql://localhost/gcme?tcpKeepAlive=true&useUnicode=yes&characterEncoding=UTF-8"
            username = "root"
            password = ""
            dialect = MyDialect
        }
    }
    test {
        dataSource {
//            dbCreate = "create"
            dbCreate = "update"
            driverClassName = "com.mysql.jdbc.Driver"
            url = "jdbc:mysql://localhost/gcmetest?createDatabaseIfNotExist=true&amp;useUnicode=true&amp;characterEncoding=utf-8"
            username = "root"
            password = ""
        }
    }
    production {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
//            dbCreate = "update"
//            url = "jdbc:h2:prodDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
//            pooled = true
//            properties {
//               maxActive = -1
//               minEvictableIdleTimeMillis=1800000
//               timeBetweenEvictionRunsMillis=1800000
//               numTestsPerEvictionRun=3
//               testOnBorrow=true
//               testWhileIdle=true
//               testOnReturn=true
//               validationQuery="SELECT 1"
//            }
        }
    }
}
