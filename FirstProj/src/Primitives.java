public class Primitives
{
    public static void main(String[] args)
    {
     //  int score; // declare a variable of type integer with name score
       // int grade;
        //int id;
       // int score, grade, id; //  multiple declaration
                                // they all have to be the same type,and should be mentioned once in the beginning
        //int a, b; double c,d;

       // int radius, area, perimeter; // declare
       // radius = 10;                  // initialize
      //  area = 5;
     //   perimeter = 2;
        // = operator -> means assignment operator


        //below will variable types

        // Java is a Type-safe language
        // int num = 45;
        // double num2 = 3.3;

        // Java supports to categories of variables : primitives and objects
        // primitives -> only store data
        // objects -> store data and perform operation ( call method) on the data that is stored

        // all primitives star with a lower case
        // refactor -> rename
        // Whenever you need to rename anything in Intellij use refactor-> rename the name and right click refactor->
        //change name
        // ; -> end of a statement
        //Java provides a primitives:
        // byte, short, int, long, float, double, char, boolean
        // reserved key words and they are all lowercase.
        // there are 4 integra (whole number) types
        // byte  = -128 to 127 (uses 1 byte)
        // short = -32768 to 32768 (uses 2 bytes)
        // int = -2147483648to 2147483647 (uses 4 bytes)


       //long value requires that you put l or L at the end of the number or else it won't compile.
        // long = -9223372036854775808 to 9223372036854775807 (uses 8 bytes)
      // larger vaules that dont fit into long can be fit into BigInterger class
      //BigInterger -> syntax used to store vaule more then long.



        // the reason you would ever use a primitive that holds a lower value is because of memory issue.
    // Within the main method you cannot have 2 intergers with the same name.
        // variables cannot start with a number
        //only allowed special characters $ and _




    //    int num5 = 45;
     //   String name = "Roman";
     //   System.out.println(num5);
      //  System.out.println(name.toUpperCase()); // method call


        // Decimal Primitives:
        // float, double...

        double p = 3.14;// uses 8 bytes, more precise
        // reason it's called double is because its double the precision of float
        float degress = 45.7F; // uses 4 bytes and is less precise
        //just like long you must a F syntax at the end of the number to compile

        //examples below

        double nxx = 3.111111111111111111111111111111111111111111111;
        float nnn = 3.1111111111111111111111111111111111111111111111F;
     //   99% of the time you use double.

        // char -> character
        char someCharacter = '%'; // char can only store one single character
        // the range of char is 0 to 65535. (thats how many characters there are)


      //  boolean isOnline = variable type that can only store 2 values( "true"/"false") //
        boolean inOnline = true;
        boolean Married = false;
        if (inOnline == true);{
            System.out.println("send a zoom link");
        }



        // String is a object type that stores text













    }
}
