/**
 * Driver class for the ShoppingCart that reads what the users wants to buy
 * how much it costs, and how much he is buying
 * @version 11/16/2017
 * @author Joseph Rosenberry
 **/
import java.util.*;
public class ShopTest{

    public static void main (String [] args){
        System.out.println("\f");
        String n = "";
        Item item;
        String itemName;
        double unitPrice;
        int quantity;

        Scanner scan = new Scanner(System.in);

        String continueShopping = "Yes";
        ShoppingCart2 cart1 = new ShoppingCart2();
        while (!n.equals("Y")){
            System.out.print ("Enter the name of the item: ");
            itemName = scan.next();

            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            
            System.out.print ("Enter the unit price: ");
            unitPrice = scan.nextDouble();

            cart1.addToCart(itemName, unitPrice, quantity);

            System.out.println(cart1);
            System.out.print("Are you finished shopping (Y/N)");
            n = scan.next();
            n = n.toUpperCase();
        }
        System.out.println("Please pay: $" + String.format("%.2f", cart1.getTotalPrice()));
    }
}
