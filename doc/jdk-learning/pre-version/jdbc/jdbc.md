# jdbc(java database connectivity)

# 先下载mysql驱动，不同版本自己找，这里使用8.0.19
- [驱动下载地址](https://dev.mysql.com/downloads/connector/j/)
- 选中 Platform Independent，下载压缩包
- 解压得到 mysql-connector-java-8.0.19.jar
- 添加jar包到项目依赖
- MySQL 8.0 以上版本不需要建立 SSL 连接的，需要显示关闭。
- 最后还需要设置 CST。

```
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_demo?useSSL=false&serverTimezone=UTC","root","password");
```

jdk 封装了一套通用的sql数据库存取和操作的公共接口(面向接口编程)
mysql、oracle、sqlserver、db2

步骤：
- 导入 java.sql 包
- 驱动
    - jdbc-odbc 桥方式，
    - 产商提供的驱动
- 加载并注册驱动程序
- 创建 Connection 对象
- 创建 Statement对象
- 执行 SQL 语句
- 使用 ResultSet 对象
- 关闭 ResultSet 对象
- 关闭 Statement 对象
- 关闭 Connection 对象
- 结束

