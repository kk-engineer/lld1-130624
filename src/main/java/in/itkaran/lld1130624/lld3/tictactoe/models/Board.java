package in.itkaran.lld1130624.lld3.tictactoe.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Board {
    private int dimension;
    private List<List<Cell>> board;
    public Board(int dimension) {
        this.dimension = dimension;
        this.board = new ArrayList<>();

        for (int i = 0; i < dimension; i++) {
            board.add(new ArrayList<>());

            for (int j = 0; j < dimension; j++) {
                board.get(i).add(new Cell(i, j));
            }
        }
    }

    public void print() {
        for (List<Cell> cells : board) {
            for (Cell cell : cells) {
                if (cell.getCellState().equals(CellState.EMPTY)) {
                    System.out.print("|  |");
                } else {
                    System.out.print("| " + cell.getPlayer().getSymbol().getSymbol() + " |");
                }
            }
            System.out.println();
        }
    }
}
