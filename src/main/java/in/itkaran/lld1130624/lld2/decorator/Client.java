package in.itkaran.lld1130624.lld2.decorator;

public class Client {
    public static void main(String[] args) {
        demoDecorator();
    }

    private static void demoDecorator() {

        // Create base ice-cream
        //IceCream iceCream = new OrangeCone();
        IceCream iceCream = new ChocolateCone();
        // Add toppings
        IceCream finalIceCream = new VanillaScoop(iceCream);
        finalIceCream = new ChocolateSyrup(finalIceCream);
        finalIceCream = new PistaScoop(finalIceCream);
        finalIceCream = new Cherry(finalIceCream);
        System.out.println(finalIceCream.getDescription());
        System.out.println(finalIceCream.getCost());

    }
}
