public class Main {
    public static void main(String[] args) {
        Shipping standardShipping = ShippingFactory.createShipping("standard");
        standardShipping.ship();

        Shipping courierShipping = ShippingFactory.createShipping("courier");
        courierShipping.ship();

        Shipping airMailShipping = ShippingFactory.createShipping("airmail");
        airMailShipping.ship();
    }
}
