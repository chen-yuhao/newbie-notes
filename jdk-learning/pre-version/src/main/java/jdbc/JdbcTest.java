package jdbc;

import org.junit.Test;

import java.sql.*;
import java.util.Properties;

/**
 * @author chenyuhao
 * @version 1.0.0
 * @ClassName JdbcTest.java
 * @createTime 2020年04月25日 18:05:00
 * @Description TODO
 */
public class JdbcTest {

    @Test
    public void testConnection1() throws SQLException, ClassNotFoundException {
        // ================ 查询数据 ================

        // 1\加载驱动
        // 把com.mysql.jdbc.Driver这份字节码加载进JVM
        // 当一份字节码加载进JVM的时候，就会执行字节码文件中的静态代码块
        // 这里加载该字节码之后会实例化一个驱动器
        Class.forName("com.mysql.jdbc.Driver");

        //        String url = "jdbc:mysql://localhost:3306/test";
        // MySQL 8.0 以上版本不需要建立 SSL 连接的，需要显示关闭,还需要设置 CST。
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
        String username = "root";
        String password = "root";
        // 2\ 连接数据库
        Connection connection = DriverManager.getConnection(url, username, password);


        // 3\创建sql语句
        String sql = "select count(*) as total from stu"; // 查询一共有几行数据

        // 4\执行sql语句
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(sql);

        if(rs.next()) {
            int count = rs.getInt("total");
            System.out.println(count); // 1
        }

        // 5\释放
        st.close();
        connection.close();
    }
}
