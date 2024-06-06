public class CourierShipping implements Shipping {
    @Override
    public void ship() {
        System.out.println("Shipping via Courier Service.");
    }
}