public class CourierShipping implements ShippingMethod {
    @Override
    public void ship() {
        System.out.println("Shipping via courier service.");
    }
}