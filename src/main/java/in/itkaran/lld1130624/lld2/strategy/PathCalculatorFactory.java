package in.itkaran.lld1130624.lld2.strategy;

public class PathCalculatorFactory {

    public static PathCalculator getPathCalculator(ModeType mode) {
        if (mode.equals(ModeType.CAR)) return new CarPathCalculator();
        else if (mode.equals(ModeType.BIKE)) return new BikePathCalculator();
        else if (mode.equals(ModeType.WALK)) return new WalkPathCalculator();
        return null;
    }
}
