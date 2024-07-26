package in.itkaran.lld1130624.lld3.tictactoe.services.strategies.botplayingstrategy;

import in.itkaran.lld1130624.lld3.tictactoe.models.Board;
import in.itkaran.lld1130624.lld3.tictactoe.models.Cell;
import in.itkaran.lld1130624.lld3.tictactoe.models.CellState;
import in.itkaran.lld1130624.lld3.tictactoe.models.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Cell makeMove(Board board) {
        //Iterate through the board and make the move at the first available cell.
        for (List<Cell> cells : board.getBoard()) {
            for (Cell cell : cells) {
                if (cell.getCellState().equals(CellState.EMPTY)) {
                    return cell;
                }
            }
        }
        return null;
    }
}
