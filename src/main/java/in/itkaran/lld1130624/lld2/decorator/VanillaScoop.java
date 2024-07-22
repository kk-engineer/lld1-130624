package in.itkaran.lld1130624.lld2.decorator;

public class VanillaScoop extends ToppingDecorator{

    public VanillaScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }

    public String getDescription(){
        return iceCream.getDescription() + " + Added Vanilla Scoop";
    }

    public Double getCost(){
        return iceCream.getCost() + 75;
    }
}
