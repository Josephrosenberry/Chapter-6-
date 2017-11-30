/**
 * Plays a game of High-Low and whoever has the higher card wins!
 * @author Joseph Rosenberry
 * @version 11/30/2017
 */
import java.util.*;
public class HighLow {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("\fWelcome to High Low");
        DeckOfCards myDeckOfCards2 = new DeckOfCards();
        System.out.println("The dealer will get a card and so will you and we will see who wins");
        String temp = "Y";
        while (!temp.equalsIgnoreCase("N")){
            myDeckOfCards2.shuffle();
            Card dealercard = myDeckOfCards2.dealCard();
            Card playercard = myDeckOfCards2.dealCard();
            System.out.println("\nDealers Card: " + dealercard);
            System.out.println("Players Card: " + playercard);
            int dealercardpoints = dealercard.GetValue();
            int playercardpoints = playercard.GetValue();
            int dealercardsuitvalue = dealercard.GetSuitValue();
            int playercardsuitvalue = playercard.GetSuitValue();

            if (dealercardpoints > playercardpoints)
                System.out.println("\nThe dealer has a higher card, Dealer wins");
            else if (playercardpoints > dealercardpoints)
                System.out.println("\nThe Player has the higher card. You Win!");
            else if (playercardpoints ==dealercardpoints){
                 if (dealercardsuitvalue > playercardsuitvalue)
                 System.out.println("The dealer has the higher card, Dealer Wins");
                 else if (dealercardsuitvalue < playercardsuitvalue)
                 System.out.println("You have a higher card, you win!");
                }

            System.out.println("\nWould you like to play again, press N for No, or Y for Yes");
            temp = scan.next();
            

        }
        System.out.println("\nThanks for playing!");
    }
}