import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<ProductForSale> products = new ArrayList<>();
    private List<OrderItem> orderItems = new ArrayList<>();

    public void addProduct(ProductForSale product) {
        products.add(product);
    }

    public void displayProducts() {
        System.out.println("\nAvailable Products:");
        System.out.println("\n-------------------------------");
        for (int i = 0; i < products.size(); i++) {
            System.out.print((i + 1) + ". ");
            products.get(i).showDetails();
            System.out.println("\n-------------------------------");
        }
    }

    public void addToOrder(int productIndex, int quantity) {
        if (productIndex >= 1 && productIndex <= products.size()) {
            ProductForSale selectedProduct = products.get(productIndex - 1);
            orderItems.add(new OrderItem(selectedProduct, quantity));
            System.out.printf("%2d x %s added to order.", quantity, selectedProduct.getType());

        } else {
            System.out.println("Product is not available");
        }
    }

    public void printReceipt() {
        System.out.println("\nReceipt:");
        double total = 0;
        for (OrderItem item : orderItems) {
            item.getProduct().printPricedItem(item.getQuantity());
            total += item.getProduct().getSalesPrice(item.getQuantity());
        }
        System.out.printf("Total: %.2f EUR%n", total);
    }

    public static void main(String[] args) {
        Store store = new Store();

        store.addProduct(new Electronics("Laptop", 599.99, "Lenovo latest i7 notebook"));
        store.addProduct(new Electronics("Phone", 28599.99, "1st generation iPhone (new)"));
        store.addProduct(new Books("Harry Potter", 19.99, "Harry Potter series"));
        store.addProduct(new Books("Anne of Green Gables", 26.72, "The tale of a free-spirited orphan girl who comes to live in Avonlea, Prince Edward Island"));

        store.displayProducts();

        store.addToOrder(1, 2);
        store.addToOrder(3, 3);
        store.addToOrder(4, 1);

        store.printReceipt();

    }
}