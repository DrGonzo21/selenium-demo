package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeclareExceptions {


    public static void main(String[] args)  throws SQLException, FileNotFoundException {  // Declaring is simply adding throws and method header and you can add as many as you want

        // Declare the exception
        DriverManager.getConnection(":jhdsk","lkjfd","lkjfdlkfj");
        FileInputStream fis = new FileInputStream("jkhf");
    }
}
