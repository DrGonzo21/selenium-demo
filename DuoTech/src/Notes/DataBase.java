package Notes;

import java.sql.DriverManager;

public class DataBase {
    static String connection;
    static {
        connection = "connected";
        System.out.println("DataBase connected");
    }
    public static void getDataArray(){
        if(connection != null){
            System.out.println("Array Data is grabbed");
        }
    }
}
