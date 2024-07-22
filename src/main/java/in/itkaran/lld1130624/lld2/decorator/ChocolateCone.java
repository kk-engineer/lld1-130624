package in.itkaran.lld1130624.lld2.decorator;

public class ChocolateCone implements IceCream {
    @Override
    public Double getCost() {
        return 20.0;
    }

    @Override
    public String getDescription() {
        return "Base Chocolate Cone";
    }
}
