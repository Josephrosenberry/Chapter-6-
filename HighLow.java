import java.util.*;
public class HighLow {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("\fWelcome to High Low");
        DeckOfCards myDeckOfCards2 = new DeckOfCards();
        
        for (int i = 0; i < 13; i++)
        {
            // printf method used for formatting output
            // print string (%) in a space of 20 characters (-20s)
            System.out.printf("%-20s%-20s%-20s%-20s\n",
                myDeckOfCards2.dealCard(), myDeckOfCards2.dealCard(),
                myDeckOfCards2.dealCard(), myDeckOfCards2.dealCard());
        }
        System.out.println("The dealer will get a card and so will you and we will see who wins");
    }
}