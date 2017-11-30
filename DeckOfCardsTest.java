/**
 * Shuffles out a deck of 52 cards
 * @author Joseph Rosenberry
 * @version 11/30/2017
 */
public class DeckOfCardsTest
{
    public static void main (String[] args)
    {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // put Card objects in random order
        /**
         * prints all 52 cards
         */
        for (int i = 0; i < 13; i++)
        {
            // printf method used for formatting output
            // print string (%) in a space of 20 characters (-20s)
            System.out.printf("%-20s%-20s%-20s%-20s\n",
                myDeckOfCards.dealCard(), myDeckOfCards.dealCard(),
                myDeckOfCards.dealCard(), myDeckOfCards.dealCard());
        }
    }
}