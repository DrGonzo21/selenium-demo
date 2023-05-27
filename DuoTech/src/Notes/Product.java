package Notes;

public class Product {

    String name;
    String description;
    String seller;

    double price;
    boolean isInStock;
    double rating;
    long productSerialID;

    static String company = "Amazon";

    static final boolean SELLABLE = true;

    static int count = 0;


    public Product(String name, String description, String seller, double price, boolean isInStock, double rating) {
        this.name = name;
        this.description = description;
        this.seller = seller;
        this.price = price;
        this.isInStock = isInStock;
        this.rating = rating;
        this.productSerialID = generateRandomId();
        count++;


    }
    public static long generateRandomId(){
        return(1000000000L+(long)Math.random()*1000000000L);
    }
}
