import java.util.Scanner;

/**
 * TicTacToe
 * UC3 reads a slot number (1–9) entered by the user.
 */
public class TicTacToe {

    public static void main(String[] args) {

        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    /**
     * Reads an integer slot value from the user.
     */
    static int getUserSlot() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");

        int slot = scanner.nextInt();  // Read input

        return slot;  // Return the entered value
    }
}