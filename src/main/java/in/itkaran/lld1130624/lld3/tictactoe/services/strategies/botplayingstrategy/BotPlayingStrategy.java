package in.itkaran.lld1130624.lld3.tictactoe.services.strategies.botplayingstrategy;

import in.itkaran.lld1130624.lld3.tictactoe.models.Board;
import in.itkaran.lld1130624.lld3.tictactoe.models.Cell;
import in.itkaran.lld1130624.lld3.tictactoe.models.Move;

public interface BotPlayingStrategy {
    Cell makeMove(Board board);
}
