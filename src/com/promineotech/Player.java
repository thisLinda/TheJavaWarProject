package com.promineotech;

import java.util.LinkedList;
import java.util.List;

/* Create the class: Player */
public class Player {

/*
 * Create the fields: hand (List of Card)--note the verbiage "List of Card" indicates angle brackets, score (set to 0 in the constructor), name; then create constructor
 Create private fields and getters and setters for each to access them; standard way (but don't use for private things like password, would set but not get); NOTE: will never have a hand when creating the constructor
*/
    //    private List<Card> hand;
    private List<Card> hand = new LinkedList<>();
    public int score;
    private String name;

    public Player(String name) {
        // since score is set to zero, do not need it as a parameter
        this.score = 0;
        this.name = name;
    }

    // use the getters to compare scores for each player
    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public int getScore() {
        return score;
    }

    //    public void setScore(int score) {
    public void setScore() {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
     * Create the following methods: describe (prints out information about the player and calls the describe method for each card in the Hand List), flip (removes and returns the top card of the Hand), in draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field), incrementScore (adds 1 to the Player’s score field)
     */
    // void method rather than string because of the functionality of describe
    public void describe() {
        System.out.println("Player: " + this.getName() + ", Score: " + this.getScore());
        for (Card card : hand) {
            card.describe();
        }
    }

    public Card flip() {
        Card singleCard = this.hand.get(0);
        hand.remove(0);
        return singleCard;
    }

    public void incrementScore() {
        score = getScore() + 1;
    }

    public void playerDraw(Deck deck) {
        this.hand.add(deck.draw());
    }

}