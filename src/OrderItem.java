public class OrderItem {
    private final ProductForSale product;
    private final int quantity;

    public OrderItem(ProductForSale product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public ProductForSale getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
