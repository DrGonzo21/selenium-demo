package Notes;

public class Wrapper {
    public static void main(String[] args) {



        int i = 9;

//     Interger intObject = new Integer (45); deprecated means no longer using in java

        Integer intOject = 45;


        // 2 of the common ones we will use are valueOf() and parseXxx()

        // Each numeric Wrapper class has xxxValue() method that returns xxx
        double v = intOject.doubleValue(); // returns primitive double value for this in object
        System.out.println(i);
        System.out.println(intOject.doubleValue());

    }

}
