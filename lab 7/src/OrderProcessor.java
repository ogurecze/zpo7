public class OrderProcessor {
    private ShippingFactory shippingFactory;

    public OrderProcessor(ShippingFactory shippingFactory) {
        this.shippingFactory = shippingFactory;
    }

    public void processOrder() {
        ShippingMethod shippingMethod = shippingFactory.createShippingMethod();
        shippingMethod.ship();
    }
}