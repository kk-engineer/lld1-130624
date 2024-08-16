package in.itkaran.lld1130624.lld3.parkinglot.services.factory;

import in.itkaran.lld1130624.lld3.parkinglot.models.SpotAssignmentStrategyType;
import in.itkaran.lld1130624.lld3.parkinglot.services.strategies.CheapestSpotAssignmentStrategy;
import in.itkaran.lld1130624.lld3.parkinglot.services.strategies.NearestSpotAssignmentStrategy;
import in.itkaran.lld1130624.lld3.parkinglot.services.strategies.RandomSpotAssignmentStrategy;
import in.itkaran.lld1130624.lld3.parkinglot.services.strategies.SpotAssignmentStrategy;

public class SpotAssignmentStrategyFactory {
    public static SpotAssignmentStrategy getSpotAssignmentStrategy(SpotAssignmentStrategyType spotAssignmentStrategyType) {
        switch (spotAssignmentStrategyType) {
            case NEAREST:
                return new NearestSpotAssignmentStrategy();
            case CHEAPEST:
                return new CheapestSpotAssignmentStrategy();
            case RANDOM:
                return new RandomSpotAssignmentStrategy();
            default:
                return null;
        }
    }
}
