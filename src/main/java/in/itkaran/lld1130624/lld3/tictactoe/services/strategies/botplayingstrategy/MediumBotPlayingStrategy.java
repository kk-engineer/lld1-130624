package in.itkaran.lld1130624.lld3.tictactoe.services.strategies.botplayingstrategy;

import in.itkaran.lld1130624.lld3.tictactoe.models.Board;
import in.itkaran.lld1130624.lld3.tictactoe.models.Cell;
import in.itkaran.lld1130624.lld3.tictactoe.models.CellState;
import in.itkaran.lld1130624.lld3.tictactoe.models.Move;

import java.util.Random;

public class MediumBotPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Cell makeMove(Board board) {
        // Generate a random number, check if that cell is empty and make move
        int row, col;
        do {
            Random rand = new Random();
            int totalCells = board.getDimension() * board.getDimension();
            int cellIndex = rand.nextInt(totalCells);
            row = cellIndex/board.getDimension();
            col = cellIndex - (row*board.getDimension());
        } while (!board.getBoard().get(row).get(col).getCellState().equals(CellState.EMPTY));

        return new Cell(row, col);
    }
}
