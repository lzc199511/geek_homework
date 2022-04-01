package com.geek.homework4.ten;

import java.sql.*;


public class Dao {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        String jdbc="jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&amp;characterEncoding=utf-8";
        Connection conn=DriverManager.getConnection(jdbc, "root", "");//链接到数据库

        Statement state=conn.createStatement();
        //增
        String sql="insert into xs values('1108','张伟','汉企')";
        state.executeUpdate(sql);
        //删
        String sql1="delete from xs where xuehao='1108'";
        state.executeUpdate(sql1);
        //改
        String sql2="update xs set xuexiao='淄博汉企' where xuehao='1101' ";
        state.executeUpdate(sql2);
        //查
        String sql3="select * from xs";
        ResultSet rs=state.executeQuery(sql3);

        while(rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
        state.executeUpdate(sql);
        conn.close();

    }

}
