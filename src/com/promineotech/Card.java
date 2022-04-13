package com.promineotech;

/*
 * Create the class: Card
 */
public class Card {

    /*
     * Create the following fields (variables): value (contains a value from 2-14 representing cards 2-Ace), name (e.g. Ace of Diamonds, or Two of Hearts)
     */
    private String cardNumber;
    private String cardSuit;
    private int value;

    public Card(String cardNumber, String cardSuit, int value) {
        this.cardNumber = cardNumber;
        this.cardSuit = cardSuit;
        this.value = value;
    }

    /*
     * Create the following methods: getters and setters, describe (prints out information about a card)
     */
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(String cardSuit) {
        this.cardSuit = cardSuit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String describe() {
        return cardNumber + " of " + cardSuit + ", points: " + value + ",";
    }

}