package Exception;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DeclareDemo2 {

    public static void main(String[] args) throws SQLException {

        // declare exception
        createdDataBaseConnection();

    }
    public static void createdDataBaseConnection() throws SQLException {
        try {
            DriverManager.getConnection(":jhdsk","lkjfd","lkjfdlkfj");
        } catch (SQLException e) {
            System.out.println("DataBaseDown!!");
        }
    }
}
