package com.promineotech;

import java.util.*;

/*
 * Create the class: Deck
 */

public class Deck {

    /*
     * Create the field: cards (a List of Card)
     */
    List<Card> deck = new ArrayList<Card>();
    //  static final creates a constant value, a card is immutable
    public static final String[] cardSuit = {"Hearts", "Diamonds", "Spades", "Clubs"};
    public static final String[] cardNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    int value = 2;

    //  class constructor
    public Deck() {
        buildDeck();
    }

    //  create a deck, print out with enhanced for loop; the deck returned is an object, convert with toString or StringBuilder
    public void buildDeck() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                this.deck.add(new Card(cardNumber[j], cardSuit[i], value++));
            }
            value = 2;
        }

    }

    /*
     * Create the following methods: shuffle (randomizes the order of the cards), draw (removes and returns the top card of the Cards field); in the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards
     */
    public void shuffle() {
        Collections.shuffle(this.deck);
    }

    // https://beginnersbook.com/2013/12/java-arraylist-remove-method-example/#:~:text=Method%20remove(int%20index)%20is,(index%20size%20of%20ArrayList).
    public Card draw() {
        Card drawnCard = this.deck.get(0);
        deck.remove(0);
        return drawnCard;
    }

}
