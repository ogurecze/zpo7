public class ExpressShipping implements ShippingMethod {
    @Override
    public void ship() {
        System.out.println("Shipping via express delivery.");
    }
}