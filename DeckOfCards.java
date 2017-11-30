/**
 * Creates a deck of cards, with 13 different faces and 3 different suits
 * @author Joseph Rosenberry
 * @version 11/30/2017
 */
public class DeckOfCards {
    private Card deck[];
    private int currentCard;
    private final int NUMBER_OF_CARDS = 52;
    private String faces[] = {"Ace", "Two", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };
    /**
     * Fills a deck array with card objects
     */
    public DeckOfCards()
    {
        deck = new Card[ NUMBER_OF_CARDS ];
        currentCard = 0; // set currentCard so first Card dealt is deck[0]
        // populate deck with Card objects
        for (int count = 0; count < deck.length; count ++)
            deck [ count ] = new Card(faces[count % 13], suits [count / 13]);
    } // end DeckOfCards constructor
    /**
     * Shuffles a deck of cards
     */
    public void shuffle()
    {
        for (int first = 0; first < deck.length; first++)
        {
            // select a random number between 0 and 51
            int second = (int)(Math.random() * 52);
            // swap current Card with randomly selected Card
            Card temp = deck[ first ];
            deck[ first ]  = deck[second];
            deck [ second ] = temp;
        }
    } // end method shuffle
    /**
     * Deals a card
     */
    public Card dealCard()
    {
        // determine whether Cards remain to be dealt
        if (currentCard < deck.length)
            return deck [ currentCard++ ];
        else
            return null; // return null to indicate no more cards
    }
}