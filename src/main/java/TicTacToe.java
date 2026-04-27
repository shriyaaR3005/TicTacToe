import java.util.Random;

/**
 * TicTacToe
 * UC2 performs a random toss to decide who plays first and assigns
 * symbols (X or O) to the human and computer accordingly.
 */
public class TicTacToe {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    /**
     * Uses random logic to decide the first player and assigns symbols
     */
    static void tossAndAssignSymbols() {
        Random random = new Random();

        // Toss: 0 or 1
        int toss = random.nextInt(2);

        if (toss == 0) {
            // Human starts
            isHumanTurn = true;

            // Randomly assign symbol
            if (random.nextBoolean()) {
                humanSymbol = 'X';
                computerSymbol = 'O';
            } else {
                humanSymbol = 'O';
                computerSymbol = 'X';
            }

        } else {
            // Computer starts
            isHumanTurn = false;

            // Randomly assign symbol
            if (random.nextBoolean()) {
                computerSymbol = 'X';
                humanSymbol = 'O';
            } else {
                computerSymbol = 'O';
                humanSymbol = 'X';
            }
        }
    }

    /**
     * Displays the toss result
     */
    static void displayTossResult() {
        if (isHumanTurn) {
            System.out.println("Human won the toss and will play first.");
        } else {
            System.out.println("Computer won the toss and will play first.");
        }

        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}