package in.itkaran.lld1130624.lld2.decorator;

public class OrangeCone implements IceCream{

    @Override
    public Double getCost() {
        return 10.0;
    }

    @Override
    public String getDescription() {
        return "Base Orange Cone";
    }
}
