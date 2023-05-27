package PassbyValue;

public class OverloadinCallOrder {
    public static void main(String[] args) {
        myMethod(34); // will call int

//        myMethod((short)34); // have to cast to short to call for short
//        myMethod(3.5); // will call double
//        myMethod(3.5F); // with the F now it will call float
    }
    public static void myMethod(short i){
        System.out.println("short");

    }
    public static void myMethod(int i){
        System.out.println("int");

    }

    public static void myMethod(long i){
        System.out.println("long");

    }
    public static void myMethod(float i){
        System.out.println("float");

    }

    public static void myMethod(double i){
        System.out.println("double");

    }
}
