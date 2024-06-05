public class StandardShippingFactory extends ShippingFactory {
    @Override
    public ShippingMethod createShippingMethod() {
        return new StandardShipping();
    }
}