package in.itkaran.lld1130624.lld3.tictactoe.services.strategies.winningstrategy;

import in.itkaran.lld1130624.lld3.tictactoe.models.Board;
import in.itkaran.lld1130624.lld3.tictactoe.models.Move;
import in.itkaran.lld1130624.lld3.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy {
    private Map<Integer, Map<Symbol, Integer>> rowCounts = new HashMap<>();

    @Override
    public boolean isWinning(Board board, Move move) {
        int row = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();

        // check in current row present in map
        if (!rowCounts.containsKey(row)) {
            rowCounts.put(row, new HashMap<>());
        }

        Map<Symbol, Integer> rowMap = rowCounts.get(row);

        // check if current symbol present in map
        if (!rowMap.containsKey(symbol)) {
            rowMap.put(symbol, 0);
        }

        rowMap.put(symbol, rowMap.get(symbol) + 1);
        return rowMap.get(symbol).equals(board.getDimension());
    }
}
