public class StandardShipping implements ShippingMethod {
    @Override
    public void ship() {
        System.out.println("Shipping via standard post.");
    }
}