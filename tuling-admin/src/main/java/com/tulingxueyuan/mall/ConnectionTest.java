package com.tulingxueyuan.mall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Register the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            String url = "jdbc:mysql://localhost:3306/mall_tiny2?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai";
            String username = "root";
            String password = "Liuhuzile0301";
            connection = DriverManager.getConnection(url, username, password);

            // Do something with the connection

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the connection
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

