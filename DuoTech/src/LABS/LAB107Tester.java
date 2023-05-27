package LABS;

public class LAB107Tester {
    public static void main(String[] args)
    {
        LAB107 product1 = new LAB107();

        LAB107 product2 = new LAB107("Shampoo", 5, true);
        LAB107 product3 = new LAB107("Bananas", 2, true, 10);
        LAB107 product4 = new LAB107("Toothpaste", 3, false, 5);

        System.out.println(product1.getLabel() + " - " + product1.getPrice() + " - " + product1.getCategory() + " - " + product1.getHasExpiration() + " - " + product1.getStock());
        System.out.println(product2.getLabel() + " - " + product2.getPrice() + " - " + product2.getCategory() + " - " + product2.getHasExpiration() + " - " + product2.getStock());
        System.out.println(product3.getLabel() + " - " + product3.getPrice() + " - " + product3.getCategory() + " - " + product3.getHasExpiration() + " - " + product3.getStock());
        System.out.println(product4.getLabel() + " - " + product4.getPrice() + " - " + product4.getCategory() + " - " + product4.getHasExpiration() + " - " + product4.getStock());

    }
}