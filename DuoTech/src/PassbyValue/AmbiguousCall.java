package PassbyValue;

public class AmbiguousCall {
    public static void main(String[] args) {
        myMethod(3.5, 4);
        myMethod(3, 4.5);
//        myMethod(3,4); -> this is a ambiguous call , Don't be ambiguous and use specific code for calls

    }
    public static void myMethod(int i, double j){
        System.out.println("int double");
    }
    public static void myMethod(double i, int j){
        System.out.println("double int");
    }
}
