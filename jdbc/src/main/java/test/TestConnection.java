package test;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class TestConnection {
    public static void main(String[] args) {
        Properties properties = new Properties();

        // Credentials to login MySQL Db
        properties.put("user", "dev");
        properties.put("password", "dev");

        // MySQL Db address
        String connString = "jdbc:mysql://localhost:3306/test_db";

        try {
            DriverManager.getConnection(connString, properties);
            System.out.println("Connected to DB");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}