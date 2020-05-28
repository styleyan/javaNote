package com.isyxf.jdbc;

//import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author xiaofei.yan
 * @Create 2019-10-14 17:19
 * @Descript
 */
public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://118.25.49.178:3306/blog?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true", "root", "yxf@3307");
            Statement stmt = conn.createStatement();

            String sql = "SELECT * FROM blog_users";

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println(rs.getInt("id"));
            System.out.println(rs);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
