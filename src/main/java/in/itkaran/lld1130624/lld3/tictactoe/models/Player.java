package in.itkaran.lld1130624.lld3.tictactoe.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Player {
    private String name;
    private Symbol symbol;
    private PlayerType playerType;
    private static final Scanner scanner = new Scanner(System.in);

    public Player(String name, Symbol symbol, PlayerType playerType) {
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public Cell makeMove(Board board) {
        System.out.println("It is " + this.getName() + "'s turn");
        int row, col;
        do {
            do {
                System.out.println("Please enter the row index of next move, starting from 1");
                row = scanner.nextInt() - 1;
            } while (row < 0 || row >= board.getDimension());

            do {
                System.out.println("Please enter the column index of next move, starting from 1");
                col = scanner.nextInt() - 1;
            } while (col < 0 || col >= board.getDimension());

        } while (!board.getBoard().get(row).get(col).getCellState().equals(CellState.EMPTY));

        return new Cell(row, col);
    }

}
