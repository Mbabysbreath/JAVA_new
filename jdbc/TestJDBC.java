package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author ZhaoMin
 * @date 2019/10/9 15:01
 */
public class TestJDBC {
    public static void main(String[] args){
        //初始化驱动
        //驱动类com.mysql.jdbc.Driver
        //就在mysql-connector-java-5.0.8-bin.jar中
        //如果忘记第一个步骤的导包，就会抛出ClassNotFoundException的异常
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功");
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
            //建立与数据库的Connection连接
            //这里需要提供：
            //数据库所处于的ip:本机：127.0.0.1
            //数据的端口号：3306（Mysql专用端口号）
            //数据库名称：jdbcTest
            //编码方式：UTF-8
            //账号：root
            //密码:419423mmzz
        //创建Statement：用于执行SQL语句。例如增加/删除
        //注意：使用的是java.sql.Statment
        //不要不小心使用到：com.mysql.jdbc.Statement
        try(
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/jdbcTest?characterEncoding=UTF-8",
                    "root","419423mmzz" );
            Statement s=c.createStatement();
            ) {
        //    System.out.println("连接成功，获取连接对象："+c);
        //    System.out.println("获取Statement对象："+s);
            //准备sql语句：想表内添加值
            //注意：字符串要用单引号''
            for(int i=0;i<10;i++) {
                String sql = "insert into hero values(null," + "'英雄'"+ "," + 313 + "," + 50 + ")";
                s.execute(sql);
            }
         //   System.out.println("执行插入语句成功");
        } catch(SQLException e){
            e.printStackTrace();
        }
            //数据库的连接是有限资源，相关操作结束后，养成关闭数据库的好习惯
            //先关闭Statment,再关闭Connection
            //自动关闭连接try-with-resource，因为Connection和Statment都实现了AutoClosrable接口
           /* if(s!=null)//不成功
                try{
                    s.close();
                }catch(SQLException e){
                e.printStackTrace();
                }
            if(c!=null)
                try{
                c.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
        }*/
    }
}
