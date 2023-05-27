package Notes;

public class StaticVsNonStatic {

    public static void main(String[] args) {
        Product product1 = new Product("Apple", "Iphone 13", "Apple",999.0, true, 9.9);

        Product product2 = new Product("Nike", "Air Jordan", "Nike", 150.0,false, 9.9);


        product1.rating = 4.7;
        System.out.println(product1.rating); // 4.7
        System.out.println(product2.rating); // 9.9

        product1.company = "Ebay";
        System.out.println(product1.company); // ebay
        System.out.println(product2.company); //ebay as well not Amazon

        product2.company = "Google";
        System.out.println(product1.company); //Google
        System.out.println(product2.company); //Google

        // if you put final static company then you cannot update it

        System.out.println(Product.SELLABLE);

    }
}
