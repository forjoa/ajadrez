import components.Board;
public class Main {
    public static void main(String[] args) {
        String[][] board = Board.makeBoard();
        Board.displayBoard(board);
    }
}