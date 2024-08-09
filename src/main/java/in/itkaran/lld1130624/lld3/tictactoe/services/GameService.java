package in.itkaran.lld1130624.lld3.tictactoe.services;

import in.itkaran.lld1130624.lld3.tictactoe.models.*;
import in.itkaran.lld1130624.lld3.tictactoe.services.strategies.winningstrategy.WinningStrategy;

import java.util.List;

public class GameService {
    private Game game;

    public void startGame(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) {
        game =  Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    private boolean checkWinner(Move move) {
        // check the row, col and diagonal(if applicable) winning strategies
        for (WinningStrategy winningStrategy : game.getWinningStrategies()) {
            if(winningStrategy.isWinning(game.getBoard(), move)) {
                return true;
            }
        }
        return false;
    }

    public void makeMove() {
        Player currentPlayer = game.getPlayers().get(game.getNextPlayerIndex());
        Cell moveCell = currentPlayer.makeMove(game.getBoard());

        // Valid move, we can execute on the board
        Cell boardCell = game.getBoard().getBoard().get(moveCell.getRow()).get(moveCell.getCol());
        boardCell.setCellState(CellState.FILLED);
        boardCell.setPlayer(currentPlayer);

        // Add the move to the list of moves
        Move finalMove = new Move(currentPlayer, boardCell);
        game.getMoves().add(finalMove);

        // set the next player's turn
        int nextPlayerIndex = game.getNextPlayerIndex();
        nextPlayerIndex = (nextPlayerIndex + 1) % (game.getPlayers().size());
        game.setNextPlayerIndex(nextPlayerIndex);

        // check winner
        if (checkWinner(finalMove)) {
            game.setWinner(currentPlayer);
            game.setGameState(GameState.ENDED);
        } else if (game.getMoves().size() == (game.getBoard().getDimension() * game.getBoard().getDimension())) {
            // game has drawn
            game.setGameState(GameState.DRAW);
        }
    }

    public void printBoard() {
        game.getBoard().print();
    }

    public GameState getGameState() {
        return game.getGameState();
    }

    public Player getWinner() {
        return game.getWinner();
    }
}
