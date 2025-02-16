public class Books extends ProductForSale {
    Books(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.printf("%s - %s | Price: %-5.2f", getType(), getDescription(), getPrice());
    }
}
