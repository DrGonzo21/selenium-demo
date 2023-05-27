package Exception;

import java.time.DateTimeException;
import java.util.InputMismatchException;

public class RuntimeExceptions {

    public static void main(String[] args) {

        // examples of runtime exceptions
        NullPointerException np;
        ArrayIndexOutOfBoundsException arr;
        StringIndexOutOfBoundsException str;
        NumberFormatException nf;
        InputMismatchException jk;
        ClassCastException ck;
        ArithmeticException a;
        DateTimeException dt;

        //Can you handle or declare runtimeExceptions?
        // yes you can handle or declare, but it is better to fix the issue in the code rather then doing try catch

//        String str1 = null;
//        try {
//            System.out.println(str1.toUpperCase());
//        }catch (Throwable t){  Can only use things that are subclass of throwable
//            System.out.println(t.getMessage());
 //       }

    }
}
