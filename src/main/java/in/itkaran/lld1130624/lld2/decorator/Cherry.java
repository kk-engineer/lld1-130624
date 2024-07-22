package in.itkaran.lld1130624.lld2.decorator;

public class Cherry extends ToppingDecorator {

    public Cherry(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Added Cherry";
    }

    @Override
    public Double getCost() {
        return iceCream.getCost() + 5;
    }
}
