package Exception;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtils {

    public static void createConnection()  {

        try {
            System.out.println("Throw exception");
            System.out.println(9/0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(" A code that runs no matter what");
        }

    }
}
