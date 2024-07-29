package in.itkaran.lld1130624.lld2.strategy;

import in.itkaran.lld1130624.lld2.strategy.strategies.PathCalculator;

public class GoogleMap {
    private PathCalculator pathCalculator;

    public GoogleMap(PathCalculator pathCalculator) {
        this.pathCalculator = pathCalculator;
    }

    public void findPath(String source, String target) {
        pathCalculator.findPath(source, target);
    }
}
