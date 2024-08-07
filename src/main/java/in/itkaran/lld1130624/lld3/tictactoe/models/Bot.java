package in.itkaran.lld1130624.lld3.tictactoe.models;

import in.itkaran.lld1130624.lld3.tictactoe.services.factory.BotPlayingStrategyFactory;
import in.itkaran.lld1130624.lld3.tictactoe.services.strategies.botplayingstrategy.BotPlayingStrategy;

public class Bot extends Player {
    private BotDifficultyLevel difficultyLevel;

    public Bot(String name, Symbol symbol, BotDifficultyLevel difficultyLevel) {
        super(name, symbol, PlayerType.BOT);
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public Cell makeMove(Board board) {
        System.out.println(this.getName() + " made the move");
        BotPlayingStrategy botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(difficultyLevel);
        return botPlayingStrategy.makeMove(board);
    }
}
