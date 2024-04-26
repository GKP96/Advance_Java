package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/database";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) throws SQLException {
        // Establishing connection
        try {
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            if (connection != null) {
                System.out.println("Connected to the database!");
                // You can perform database operations here
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
