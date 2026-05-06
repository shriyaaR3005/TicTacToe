public class TicTacToe {

    // Board declaration
    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        // Step 1: Initialize board with '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // Step 2: Fill board (DRAW case)
        board[0][0] = 'X'; board[0][1] = 'O'; board[0][2] = 'X';
        board[1][0] = 'X'; board[1][1] = 'O'; board[1][2] = 'O';
        board[2][0] = 'O'; board[2][1] = 'X'; board[2][2] = 'X';

        // Step 3: Check draw condition
        if (isDraw()) {
            System.out.println("It's a Draw!");
        } else {
            System.out.println("Not a Draw!");
        }
    }

    // -------- UC10 FUNCTION --------
    static boolean isDraw() {

        // If someone has already won → NOT a draw
        if (hasWon('X') || hasWon('O')) {
            return false;
        }

        // Check for empty cells
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }

        return true; // No empty cells and no winner
    }

    // -------- REQUIRED FOR UC10 --------
    static boolean hasWon(char symbol) {

        // Rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol) {
                return true;
            }
        }

        // Columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == symbol &&
                board[1][i] == symbol &&
                board[2][i] == symbol) {
                return true;
            }
        }

        // Diagonals
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) {
            return true;
        }

        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) {
            return true;
        }

        return false;
    }
}