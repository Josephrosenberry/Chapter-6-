import java.util.*;
public class ShopTest{

    public static void main (String [] args){

        Item item;
        String itemName;
        double itemPrice;
        int quantity;

        Scanner scan = new Scanner(System.in);

        String keepShopping = "Yes";
        ShoppingCart cart1 = new ShoppingCart();

        System.out.print ("Enter the name of the item: ");
        itemName = scan.next();

        System.out.print ("Enter the unit price: ");
        itemPrice = scan.nextDouble();

        System.out.print ("Enter the quantity: ");
        quantity = scan.nextInt();
    }
}
