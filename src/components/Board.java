package components;

public class Board {
    public static String[][] makeBoard() {
        String[][] board = new String[9][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (i == 0) {
                    board[i][j] = " " + j + " ";
                } else {
                    board[i][j] = "[ ]";
                }

                if (j == 0) {
                    board[i][j] = i + " ";
                }
            }
        }
        return board;
    }

    public static void displayBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println(' ');
        }
    }
}
