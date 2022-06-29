package com.jdbcdemo;

import java.sql.*;


public class WorkingClass {
    public static void dql(Statement statement, String query) throws ClassNotFoundException, SQLException {

        ResultSet rs = statement.executeQuery(query);
        while(rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
        rs.close();

    }
    public static void dml(PreparedStatement statement) throws ClassNotFoundException, SQLException{
        int noOfAffectedRows = statement.executeUpdate();
        statement.close();
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException  {
        String url = "jdbc:postgresql://localhost:5432/testdb";
        String username = "postgres";
        String password =     "@TeslaPostgresql2000";

        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(url,username,password);

        Statement statement = connection.createStatement();

        dml(connection.prepareStatement("UPDATE public.persons\n" +
                                            "SET city='Kolkatta'\n" +
                                            "WHERE firstname='AMil'"));

        connection.close();
        statement.close();
    }
}
