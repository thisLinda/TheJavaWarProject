package com.promineotech;

/* Create the class: App with a main method */

public class App {

    public static void main(String[] args) {
        new App().playJavaWar();
    }

    /* Instantiate a Deck and two Players, call the shuffle method on the deck */
    private void playJavaWar() {
        Deck deck = new Deck();

        Player player1 = new Player("Linda");
        Player player2 = new Player("notLinda");

        deck.shuffle();
        deal(deck, player1, player2);
        play(deck, player1, player2);
        checkForWin(player1, player2);

    }

    /*
     *  Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
     */
    private void checkForWin(Player player1, Player player2) {
        if (player1.score > player2.score) {
            System.out.println("Congratulations to JavaWar player " + player1.getName() + " who won " + player1.getScore() + " rounds, " + player2.getName() + " only won " + player2.getScore() + ".");
        } else if (player2.score > player1.score) {
            System.out.println("Congratulations to JavaWar player " + player2.getName() + " who won " + player2.getScore() + " rounds, " + player1.getName() + " only won " + player1.getScore() + ".");
        } else {
            System.out.println("JavaWar game ends in an unsatisfying tie. Both " + player1.getName() + " and " + player2.getName() + " won " + player1.score + " rounds.");
        }

    }

    /*
     * Using a traditional for loop, iterate 26 times and call the flip method for each player. Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value. After the loop, compare the final score from each player.
     */
    private void play(Deck deck, Player player1, Player player2) {
        for (int i = 0; i < 26; i++) {
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();
//            describe the card here with cardSuit and cardNumber
            System.out.println(player1.getName() + " plays the " + player1Card.describe());
            System.out.println(player2.getName() + " plays the " + player2Card.describe());
            if (player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
                System.out.println(player1.getName() + " won the round.");
            } else if (player2Card.getValue() > player1Card.getValue()) {
                player2.incrementScore();
                System.out.println(player2.getName() + " won the round.");
            }
        }
    }

    /*
     * Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
     */
    private void deal(Deck deck, Player player1, Player player2) {
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.playerDraw(deck);
            } else {
                player2.playerDraw(deck);
            }
        }
    }

}


