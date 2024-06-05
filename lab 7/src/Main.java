public class Main {
    public static void main(String[] args) {

        ShippingFactory standardShippingFactory = new StandardShippingFactory();
        OrderProcessor standardOrderProcessor = new OrderProcessor(standardShippingFactory);
        standardOrderProcessor.processOrder();

        ShippingFactory expressShippingFactory = new ExpressShippingFactory();
        OrderProcessor expressOrderProcessor = new OrderProcessor(expressShippingFactory);
        expressOrderProcessor.processOrder();

        ShippingFactory courierShippingFactory = new CourierShippingFactory();
        OrderProcessor courierOrderProcessor = new OrderProcessor(courierShippingFactory);
        courierOrderProcessor.processOrder();
    }
}