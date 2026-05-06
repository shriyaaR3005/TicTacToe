public static void main(String[] args) {

    while (!gameOver) {

        if (isHumanTurn) {
            System.out.println("Human's Turn");
            humanMove();   // assume already implemented
        } else {
            System.out.println("Computer's Turn");
            computerMove();
        }

        // Check game status after every move
        if (checkWin() || checkDraw()) {
            gameOver = true;
            break;
        }

        // Switch turns
        isHumanTurn = !isHumanTurn;
    }

    System.out.println("Game Over!");
}
