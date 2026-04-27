/**
 * UC4: Convert slot (1–9) to row & column (0–2)
 */
public class TicTacToe {

    public static void main(String[] args) {
        int slot = 7;

        int row = getRowFromSlot(slot);
        int col = getColFromSlot(slot);

        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
    }

    // Returns row index (0–2)
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    // Returns column index (0–2)
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}