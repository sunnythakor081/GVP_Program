package Singleton_data;

import java.sql.Connection;
import java.sql.SQLException;

public class MainApp {

    public static void main(String[] args) {

        // Get Singleton instance
        DatabaseConnectionManager dbManager =
                DatabaseConnectionManager.getInstance();

        // Get database connection
        Connection connection = dbManager.getConnection();

        try {
            if (connection != null && !connection.isClosed()) {
                System.out.println("Database connected successfully using Singleton!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close connection
            dbManager.closeConnection();
            System.out.println("Database connection closed.");
        }
    }
}
