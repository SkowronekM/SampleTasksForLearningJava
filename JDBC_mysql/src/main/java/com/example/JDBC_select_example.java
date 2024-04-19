package com.example;

import java.sql.*;

public class JDBC_select_example {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test",
                    "root", "");
            if(connection==null) {
                System.out.println("Nie udało się połączyć z bazą danych!");
            } else System.out.println("Jest połączenie!");

            statement = connection.createStatement();
            String sql = "SELECT * FROM employees;";
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                int salary = resultSet.getInt("salary");
                System.out.println("ID: " + id + ", name: " + name + ", salary: " + salary);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                statement.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
