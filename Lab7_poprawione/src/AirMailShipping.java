public class AirMailShipping implements Shipping {
    @Override
    public void ship() {
        System.out.println("Shipping via Air Mail.");
    }
}