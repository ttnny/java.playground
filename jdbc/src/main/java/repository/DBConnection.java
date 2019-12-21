package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    protected Connection connection;

    public DBConnection() {
        Properties properties = new Properties();

        // Credentials to login MySQL Database
        properties.put("user", "dev");
        properties.put("password", "dev");

        // MySQL Database address
        String connString = "jdbc:mysql://localhost:3306/test_db";

        try {
            connection = DriverManager.getConnection(connString, properties);
            System.out.println("Connected to DB");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}