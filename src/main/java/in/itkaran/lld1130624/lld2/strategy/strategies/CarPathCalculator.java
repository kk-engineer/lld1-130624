package in.itkaran.lld1130624.lld2.strategy.strategies;

public class CarPathCalculator implements PathCalculator {
    @Override
    public void findPath(String source, String target) {
        System.out.println("Car path calculator from: " + source + " to " + target);
    }
}
