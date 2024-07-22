package in.itkaran.lld1130624.lld2.strategy;

import org.springframework.boot.Banner;

public class Client {
    public static void main(String[] args) {
        demoStrategy();
    }

    private static void demoStrategy() {
        PathCalculator pathCalculator = PathCalculatorFactory.getPathCalculator(ModeType.CAR);
        GoogleMap googleMap = new GoogleMap(pathCalculator);
        googleMap.findPath("Kashmir", "Kanyakumari");
    }
}
