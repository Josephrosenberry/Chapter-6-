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
        ShoppingCart cart1 = new ShoppingCart();
        while (!n.equals("Y")){
            System.out.print ("Enter the name of the item: ");
            itemName = scan.next();

            System.out.print ("Enter the unit price: ");
            unitPrice = scan.nextDouble();

            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();

            cart1.addToCart(itemName, unitPrice, quantity);

            System.out.println(cart1);
            System.out.print("Are you finished shopping (Y/N)");
            n = scan.next();
            n = n.toUpperCase();
            System.out.println();
        }
        System.out.println("Please pay: $" + String.format("%.2f", cart1.getTotalPrice()));
    }
}
