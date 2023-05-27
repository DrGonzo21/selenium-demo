package LABS;
public class LAB107 {

    String label;
    int price;
    String category;
    boolean hasExpiration;
    int stock;

    public LAB107() {
    }

    public LAB107(String label, int price, String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }

    public LAB107(String label, int price, boolean hasExpiration) {
        this(label, price, "misc", hasExpiration, 0);
    }

    public LAB107(String label, int price, boolean hasExpiration, int stock) {
        this(label, price, "misc", hasExpiration, stock);
    }

    public void expired(boolean hasExpired) {
        if (hasExpiration && hasExpired) {
            stock = 0;
        }
    }

    public boolean sell(int quantity) {
        if (stock >= quantity) {
            stock -= quantity;
            return true;
        } else {
            return false;
        }
    }

    public double getDiscountedPrice(double discount) {
        return price * (1 - discount);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean getHasExpiration() {
        return hasExpiration;
    }

    public void setHasExpiration(boolean hasExpiration) {
        this.hasExpiration = hasExpiration;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}