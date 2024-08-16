package in.itkaran.lld1130624.lld3.tictactoe.controllers;

import in.itkaran.lld1130624.lld3.tictactoe.models.GameState;
import in.itkaran.lld1130624.lld3.tictactoe.models.Player;
import in.itkaran.lld1130624.lld3.tictactoe.services.GameService;
import in.itkaran.lld1130624.lld3.tictactoe.services.strategies.winningstrategy.WinningStrategy;

import java.util.List;

public class GameController {
    private final GameService gameService;

    public GameController() {
        this.gameService = new GameService();
    }
    public void startGame(int dimension, List<Player> players, List<WinningStrategy> strategies) {
        gameService.startGame(dimension, players, strategies);
    }

    public void makeMove() {
        gameService.makeMove();
    }

    public void printBoard() {
        gameService.printBoard();
    }

    public GameState getGameState() {
        return gameService.getGameState();
    }

    public Player getWinner() {
        return gameService.getWinner();
    }

    public void undoMove() {
        gameService.undoMove();
    }
}
