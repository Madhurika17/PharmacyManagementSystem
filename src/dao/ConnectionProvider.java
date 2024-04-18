package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionProvider {
    private static Connection con;

    public static Connection getConnection() throws ClassNotFoundException {
        try {
            if (con == null || con.isClosed()) { // Check if connection is null or closed
                Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3306/pharma";
                String username = "root";
                String password = "Pedri@08";
                // String password = "ark@sql#323!";
                con = DriverManager.getConnection(url, username, password);
                if (con.isClosed()) {
                    System.out.println("Connection is Closed");
                } else {
                    System.out.println("Connection established");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }
}