package in.itkaran.lld1130624.lld3.tictactoe.models;

import in.itkaran.lld1130624.lld3.tictactoe.services.strategies.winningstrategy.WinningStrategy;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
@Setter
public class Game {
    private List<Player> players;
    private Player winner;
    private Board board;
    private List<Move> moves;
    private GameState gameState;
    private int nextPlayerIndex;
    List<WinningStrategy> winningStrategies;

    private Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.players = players;
        this.moves = new ArrayList<>();
        this.board = new Board(dimension);
        this.gameState = GameState.IN_PROGRESS;
        this.winningStrategies = winningStrategies;
        Random rand = new Random();
        this.nextPlayerIndex = rand.nextInt(players.size());
    }


    // Builder
    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder{
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;
        private int dimension;

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Game build() {
            // Before building the game validate the received input
            validate();
            return new Game(dimension, players, winningStrategies);
        }

        private void validate() {
            // TODO
        }
    }

}
