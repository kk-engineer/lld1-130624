package in.itkaran.lld1130624.lld3.tictactoe;

import in.itkaran.lld1130624.lld3.tictactoe.controllers.GameController;
import in.itkaran.lld1130624.lld3.tictactoe.models.*;
import in.itkaran.lld1130624.lld3.tictactoe.services.strategies.winningstrategy.ColWinningStrategy;
import in.itkaran.lld1130624.lld3.tictactoe.services.strategies.winningstrategy.DiagonalWinningStrategy;
import in.itkaran.lld1130624.lld3.tictactoe.services.strategies.winningstrategy.RowWinningStrategy;
import in.itkaran.lld1130624.lld3.tictactoe.services.strategies.winningstrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        playTicTacToe();
    }

    private static void playTicTacToe() {
        System.out.println("Lets play TicTacToe!");
        List<Player> players = new ArrayList<>();
        players.add(new Player("AK", new Symbol('A'), PlayerType.HUMAN));
        //players.add(new Player("KK", new Symbol('K'), PlayerType.HUMAN));
        players.add(new Bot("Bot1", new Symbol('B'), BotDifficultyLevel.MEDIUM));
        //players.add(new Bot("Bot2", new Symbol('C'), BotDifficultyLevel.MEDIUM));
        //players.add(new Bot("Bot3", new Symbol('D'), BotDifficultyLevel.MEDIUM));
        int dimension = players.size() + 1;

        List<WinningStrategy> winningStrategies = List.of(
                new RowWinningStrategy(),
                new ColWinningStrategy(),
                new DiagonalWinningStrategy()
        );

        GameController gameController = new GameController();
        gameController.startGame(dimension, players, winningStrategies);

        // Play the game
        while (gameController.getGameState().equals(GameState.IN_PROGRESS)) {
            gameController.printBoard();
            gameController.makeMove();
        }

        // Game Over
        System.out.println("Game Over!");
        gameController.printBoard();
        if (gameController.getGameState().equals(GameState.ENDED)) {
            System.out.println(gameController.getWinner().getName() +
                    " Symbol " + gameController.getWinner().getSymbol().getSymbol() +
                    " won the game!");
        } else {
            System.out.println("Game Draw!");
        }
    }
}
