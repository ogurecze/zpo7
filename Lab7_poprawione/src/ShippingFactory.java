public class ShippingFactory {
    public static Shipping createShipping(String type) {
        switch (type.toLowerCase()) {
            case "standard":
                return new StandardShipping();
            case "courier":
                return new CourierShipping();
            case "airmail":
                return new AirMailShipping();
            default:
                throw new IllegalArgumentException("Unknown shipping type");
        }
    }
}
