public class ExpressShippingFactory extends ShippingFactory {
    @Override
    public ShippingMethod createShippingMethod() {
        return new ExpressShipping();
    }
}