package Exception;

import java.io.FileInputStream;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionClasses {

    public static void main(String[] args) {

        // Exception subclasses: FileNOtFoundException, IOException, InterruptedException, SQLEXception:
        //anything other then these classes you can assume that these are unchecked runtime exceptions

//        FileInputStream fis = new FileInputStream(" ");  will try to open the file in the parentheses // checked exception

        try {
            DriverManager.getConnection("sa","as","lkjahs");
        } catch (SQLException e) {
            throw new RuntimeException(e);     //SQLException

            //CXan you handle or declare Checked exceptions?
            //Yes -> and compiler forces you either handle or declare
        }
//    }
    }
}
