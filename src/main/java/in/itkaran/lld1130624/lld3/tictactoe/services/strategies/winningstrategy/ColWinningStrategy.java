package in.itkaran.lld1130624.lld3.tictactoe.services.strategies.winningstrategy;

import in.itkaran.lld1130624.lld3.tictactoe.models.Board;
import in.itkaran.lld1130624.lld3.tictactoe.models.Move;
import in.itkaran.lld1130624.lld3.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColWinningStrategy implements WinningStrategy {
    private Map<Integer, Map<Symbol, Integer>> colCounts = new HashMap<>();
    @Override
    public boolean isWinning(Board board, Move move) {
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();
        // check if current col present in map
        if (!colCounts.containsKey(col)) {
            colCounts.put(col, new HashMap<>());
        }
        Map<Symbol, Integer> colMap = colCounts.get(col);

        // check if current symbol present in map
        if (!colMap.containsKey(symbol)) {
            colMap.put(symbol, 0);
        }
        colMap.put(symbol, colMap.get(symbol) + 1);

        return colMap.get(symbol).equals(board.getDimension());
    }
}
