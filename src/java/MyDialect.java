import org.hibernate.dialect.MySQL5InnoDBDialect;

import java.sql.Types;

/**
 * Created with IntelliJ IDEA.
 * User: Dbb
 * Date: 14-3-19
 * Time: 下午4:54
 * To change this template use File | Settings | File Templates.
 */
public class MyDialect extends MySQL5InnoDBDialect {
    public MyDialect() {
        registerColumnType(Types.CHAR, "boolean");
    }
}
