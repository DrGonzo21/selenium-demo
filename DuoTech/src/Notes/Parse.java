package Notes;

public class Parse {
    public static void main(String[] args) {


       Integer integerObject = Integer.valueOf("442345"); // converts a String into an Integer object

      int integerPrimitive =  Integer.parseInt("52364236"); // converts a String into a primitive int

        // These 2 methods take a string and turn into an integer value

        double price = Double.parseDouble("23.56");
        long l = Long.parseLong("9820981209");

//        Integer.parseInt("64658673E");// NumberFormatException
//        System.out.println(Integer.parseInt("8743684768347687634")); // NumberFormatException
//        System.out.println(Long.parseLong("908540954809845")); //valid
//        System.out.println(Double.parseDouble("0.78468746")); //valid
//        System.out.println(Double.parseDouble("3.8768e-7")); // valid -> only works for double
//        System.out.println(Boolean.parseBoolean("true")); // valid
//        System.out.println(Boolean.parseBoolean("False")); //valid
//        System.out.println(Boolean.parseBoolean("no")); //false
//        System.out.println(Boolean.parseBoolean("yes")); //false
        // if you put anything else other than true it will print out false



        // Calculate the 6% tax and add on top of the price

        String price1 =  "98500.34";
        double priceAsDouble = Double.parseDouble(price1);
        double priceWithTax = priceAsDouble + priceAsDouble * 0.06;
        System.out.println(priceWithTax);

        //The only class that doesn't have a parse method is Character method
    }
}
