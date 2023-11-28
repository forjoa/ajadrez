package components;

public class Board {
    public static String[][] makeBoard() {
        String[][] board = new String[9][9];
        for (int i = 0; i < board.length - 1; i++) {
            for (int j = 0; j < board.length - 1; j++) {
                board[i][j] = "[ ]";
            }
        }
        return board;
    }

    public static void displayBoard(String[][] board) {
        for (int i = 0; i < board.length - 1; i++) {
            for (int j = 0; j < board.length - 1; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println(' ');
        }
    }
}
