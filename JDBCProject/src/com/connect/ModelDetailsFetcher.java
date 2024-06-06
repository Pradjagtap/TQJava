package com.connect;

import java.sql.*;
import java.util.HashMap;
//sent by pravin
public class ModelDetailsFetcher {

    public static void main(String[] args) {
        // JDBC URL, username, and password
        String jdbcURL = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        // HashMap to store model details
        HashMap<Integer, String> modelDetails = new HashMap<>();

        try {
            // Establishing a connection to the database
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            // SQL query to fetch model details
            String sql = "SELECT id, modelname FROM model";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // Fetching data from the result set and storing in HashMap
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String modelName = resultSet.getString("modelname");
                modelDetails.put(id, modelName);
            }

            // Closing resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Printing the HashMap
        System.out.println("Model Details:");
        for (Integer id : modelDetails.keySet()) {
            System.out.println("ID: " + id + ", Model Name: " + modelDetails.get(id));
        }
    }
}
