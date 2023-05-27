package Notes;

public class ProductTester {
    public static void main (String[] args) {
        Product product1 = new Product("Apple", "Iphone 13", "Apple", 999.0, true, 9.9);

        Product product2 = new Product("Nike", "Air Jordan", "Nike", 150.0, false, 9.9);


        // Instance variables are accessed through an instance/object
        System.out.println(product1.name);


        // Static variables class SHOULD be accessed using Classname.variableName
        System.out.println(Product.company);


        // Java allows you to access static variables with an instance/object
        // But it is discouraged and creates confusion

        System.out.println(product1.company);


        // In summary, static is anything that belongs to class (global)
        // instance -> anything that belongs to each individual object
        // members of the class are methods and variables

        // Instance methods are methods that represent the behavior of each object

        // Static methods that represent behavior for the clas and do not depend on each object
        // Usually these methods are utility/helper methods that perform some helper actions
        // that do not depend on each object
        // Any method that deals with static variables should also be static

        System.out.println(product1.productSerialID);

        // Instance methods cannot be called in static way (Classname.methodName)

        // In String class,

        String str = new String("hello");
        System.out.println(str.toUpperCase());

        // String class also has static method like valueOf that doesn't require any string object



        String convertedString = String.valueOf(45);
            
        }

    }





