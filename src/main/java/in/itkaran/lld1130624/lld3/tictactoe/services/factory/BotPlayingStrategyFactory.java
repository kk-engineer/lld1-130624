package in.itkaran.lld1130624.lld3.tictactoe.services.factory;

import in.itkaran.lld1130624.lld3.tictactoe.models.BotDifficultyLevel;
import in.itkaran.lld1130624.lld3.tictactoe.services.strategies.botplayingstrategy.BotPlayingStrategy;
import in.itkaran.lld1130624.lld3.tictactoe.services.strategies.botplayingstrategy.EasyBotPlayingStrategy;
import in.itkaran.lld1130624.lld3.tictactoe.services.strategies.botplayingstrategy.HardBotPlayingStrategy;
import in.itkaran.lld1130624.lld3.tictactoe.services.strategies.botplayingstrategy.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel difficultyLevel) {
        return switch (difficultyLevel) {
            case EASY -> new EasyBotPlayingStrategy();
            case MEDIUM -> new MediumBotPlayingStrategy();
            case HARD -> new HardBotPlayingStrategy();
            default -> new MediumBotPlayingStrategy();
        };
    }
}
