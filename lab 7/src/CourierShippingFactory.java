public class CourierShippingFactory extends ShippingFactory {
    @Override
    public ShippingMethod createShippingMethod() {
        return new CourierShipping();
    }
}