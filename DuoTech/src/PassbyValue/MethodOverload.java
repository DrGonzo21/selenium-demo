package PassbyValue;

public class MethodOverload {

    public static void main(String[] args) {
        max(3,6);
        max(3.6,7.8);
        // examples of overloaded methods

        String str = "hello";
        str.substring(1);
        str.substring(1,3);

      //  Arrays.sort( a: );

//        System.out.println(1);
//        System.out.println("dscd");
//        System.out.println(6l);
//        System.out.println();

    }
    public static void max(int a, int b){
        System.out.println(Math.max(a,b));
    }
  public static void max(double a, double b){
      System.out.println(Math.max(a,b));
  }
  public static void printMessage(){
      System.out.println("Hello");
  }
}
