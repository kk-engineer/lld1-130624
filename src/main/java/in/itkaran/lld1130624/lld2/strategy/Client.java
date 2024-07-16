package in.itkaran.lld1130624.lld2.strategy;

import org.springframework.boot.Banner;

public class Client {
    public static void main(String[] args) {
        demoStrategy();
    }
    private static PathCalculator findStrategy(ModeType mode) {
        if (mode.equals(ModeType.CAR)) return new CarPathCalculator();
        else if (mode.equals(ModeType.BIKE)) return new BikePathCalculator();
        else if (mode.equals(ModeType.WALK)) return new WalkPathCalculator();
        return null;
    }
    private static void demoStrategy() {
        ModeType mode = ModeType.BIKE;
        PathCalculator pathCalculator = findStrategy(mode);
        GoogleMap googleMap = new GoogleMap(pathCalculator);
        googleMap.findPath("Kashmir", "Kanyakumari");
    }
}
