package in.itkaran.lld1130624.lld2.decorator;

public class ChocolateSyrup extends ToppingDecorator{

    public ChocolateSyrup(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription(){
        return iceCream.getDescription() + " + Added Chocolate Syrup";
    }

    public Double getCost(){
        return iceCream.getCost() + 25;
    }
}
