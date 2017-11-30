/** 
 * Card.java contains the methods for the DeckOfCards classs Represents a Card with a face and a suit.
 * @author Joseph Rosenberry
 * @version 11/30/2017
**/ 
public class Card
{

    private String face;
    private String suit;
    /**
     * Returns face and suit of a card
     */
    public Card (String cardFace, String cardSuit)
    {
        face = cardFace;
        suit = cardSuit;
    }

    /**
     * returns the text version of each card
     */
    public String toString()
    {
        return face + " of " + suit;
    }

    /**
     * @returns face of card
     */
    public String getFace(){
        return face;
    }

    /**
     * @returns suit
     */
    public String getSuit(){
        return suit;
    }

    /**
     * Finds the point value of each card
     */
    public int GetValue(){
        int value = 0;
        if (face.equals("Ace"))
            value = 1;
        if (face.equals("Two"))
            value = 2;
        if (face.equals("Three"))
            value = 3;
        if (face.equals("Four"))
            value = 4;
        if (face.equals("Five"))
            value = 5;
        if (face.equals("Six"))
            value = 6;    
        if (face.equals("Seven"))
            value = 7;
        if (face.equals("Eight"))
            value = 8;
        if (face.equals("Nine"))
            value = 9;
        if (face.equals("Ten"))
            value = 10;
        if (face.equals("Jack"))
            value = 10;
        if (face.equals("Queen"))
            value =10;
        if (face.equals("King"))
            value = 10;  
        return value;
    }

    /**
     * point value of eachc suit
     */
    public int GetSuitValue(){
        int suitValue = 0;
        if (suit.equals("Diamonds"))
            suitValue = 1;
        if (suit.equals("Clubs"))
            suitValue = 2;
        if (suit.equals("Hearts"))
            suitValue = 3;
        if (suit.equals("Spades"))
            suitValue = 4;
       return suitValue;     
    }    
}