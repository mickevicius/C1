public class Electronics extends ProductForSale {
    Electronics(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.printf("Electronics - %s | Price: %-5.2f", getDescription(), getPrice());
    }
}
