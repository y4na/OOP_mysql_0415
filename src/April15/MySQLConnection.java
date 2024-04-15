package April15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/paragosodb";
    private static final String USERNAME = "Paragoso";
    private static final String PASSWORD = "paragoso123";
    public static Connection getConnection(){
        Connection c = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("Connected to the database!");
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        return c;
    }

    public static void main(String[] args) {
        getConnection();
    }
}
