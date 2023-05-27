package PassbyValue;

public class class01 {
    public static void main(String[] args) {
        int someNum = 23;

        increment(someNum); // pass-by-vaule for primitives means that the primitive variable's copy is passed
        // rather then the variable itself.

        // if the method modifies the variable, it doesnt affect the original variable, since the copy is passed

        System.out.println("SomeNum vaule in the main method: " + someNum);

        int anotherNum = 20;

        anotherNum = decrement(anotherNum);

        System.out.println(anotherNum);
    }

    public static void increment(int num) {
        num++;
        System.out.println("The Num's vaule inside the method: " + num);
    }

    public static int decrement(int num) {
        num--;


    return num;
}
}
