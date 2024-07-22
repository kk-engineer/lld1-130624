package in.itkaran.lld1130624.lld2.decorator;

public class PistaScoop extends ToppingDecorator{

    public PistaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription(){
        return iceCream.getDescription() + " + Added Pista Scoop";
    }

    public Double getCost(){
        return iceCream.getCost() + 85;
    }
}
