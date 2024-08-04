package in.itkaran.lld1130624.lld3.parkinglot.services.factory;

import in.itkaran.lld1130624.lld3.parkinglot.models.SpotAssignmentStrategyType;
import in.itkaran.lld1130624.lld3.parkinglot.services.strategies.CheapestSpotAssignmentStrategy;
import in.itkaran.lld1130624.lld3.parkinglot.services.strategies.NearestSpotAssignmentStrategy;
import in.itkaran.lld1130624.lld3.parkinglot.services.strategies.SpotAssignmentStrategy;

public class SpotAssignmentStrategyFactory {
    public static SpotAssignmentStrategy getSpotAssignmentStrategy(SpotAssignmentStrategyType spotAssignmentStrategyType) {
        if (spotAssignmentStrategyType == SpotAssignmentStrategyType.NEAREST) {
            return new NearestSpotAssignmentStrategy();
        } else if (spotAssignmentStrategyType == SpotAssignmentStrategyType.FLOOR_WISE) {
            return null;
        } else if (spotAssignmentStrategyType == SpotAssignmentStrategyType.CHEAPEST) {
            return new CheapestSpotAssignmentStrategy();
        }
        return null;
    }
}
