static void computerMove() {
    Random rand = new Random();
    int slot;
    int row, col;

    while (true) {
        // Step 1: Generate random slot (1–9)
        slot = rand.nextInt(9) + 1;

        // Step 2: Convert slot to row & column
        row = (slot - 1) / 3;
        col = (slot - 1) % 3;

        // Step 3: Check if the position is empty
        if (board[row][col] == '-') {
            // Step 4: Place computer symbol
            board[row][col] = computerSymbol;
            System.out.println("Computer chose slot: " + slot);
            break; // exit loop after valid move
        }
    }
}