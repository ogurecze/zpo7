public class StandardShipping implements Shipping {
    @Override
    public void ship() {
        System.out.println("Shipping via Standard Postal Service.");
    }
}