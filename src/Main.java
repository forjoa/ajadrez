import components.Board;
import constants.Messages;

public class Main {
    public static void main(String[] args) {
        String[][] board = Board.makeBoard();
        Board.displayBoard(board);

        System.out.println(Messages.BIENVENIDO);
    }
}