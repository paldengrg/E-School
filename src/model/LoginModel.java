/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;



/**
 *
 * @author aayushmanshrestha
 */

public class LoginModel {
    private Connection connection;
    private Statement statement;
    private ResultSet result;
    
    public LoginModel() {
        // Connect to the database
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","Gionee122@");
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
    }
    
    public boolean checkCredentials(String username, String password) {
        // Check if the provided credentials match any in the database
        String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
        try {
            result = statement.executeQuery(query);
            if (result.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Error executing query: " + e.getMessage());
            return false;
        }
    }
    
    public void closeConnection() {
        // Close the connection
        try {
            connection.close();
            System.out.println("Connection closed.");
        } catch (SQLException e) {
            System.out.println("Error closing connection: " + e.getMessage());
        }
    }
}

