public abstract class ProductForSale {
    private final String type;
    private final double price;
    private final String description;

    ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return price * quantity;
    }

    public void printPricedItem(int quantity) {
        System.out.printf("%-15s x %2d = $%-5.2f EUR%n", type, quantity, getSalesPrice(quantity));
    }

    public abstract void showDetails();

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
