public class Chessboard {
    public static void main(String[] args) {
        String[][] board = new String[8][8];

        initializeBoard(board);
        printBoard(board);
    }

    public static void initializeBoard(String[][] board) {

        for (int i = 0; i < 8; i++) {
            board[1][i] = "P";
            board[6][i] = "p";
        }
        board[0][0] = board[0][7] = "R";
        board[0][1] = board[0][6] = "N";
        board[0][2] = board[0][5] = "B";
        board[0][3] = "Q";
        board[0][4] = "K";

        board[7][0] = board[7][7] = "r"; 
        board[7][1] = board[7][6] = "n";
        board[7][2] = board[7][5] = "b";
        board[7][3] = "q";
        board[7][4] = "k";


        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = ".";
            }
        }
    }

    public static void printBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

