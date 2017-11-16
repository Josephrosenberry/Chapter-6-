/**
 * Creates a shopping cart to store items that a user inputs
 * @version 11/16/2017
 * @author Joseph Rosenberry
 */
import java.text.NumberFormat;
public class ShoppingCart
{
    private int itemCount; // total number of items in the cart
    private double totalPrice; // total price of items in the cart
    private int capacity; // current cart capacity
    private Item[] cart;
    /**
     * creates a shopping cart with a capacity of 5
     */
    public ShoppingCart()
    {
        capacity = 5;
        itemCount = 0;
        totalPrice = 0.0;
        cart = new Item[capacity];
    }
    /**
     * adds an item to the shopping cart
     */
    public void addToCart(String itemName, double unitPrice, int quantity)
    {
        cart[itemCount] = new Item(itemName, unitPrice, quantity);
        totalPrice += (unitPrice * quantity);
        itemCount++;

    }
    
    /**
     * increases the capacity of shopping cart by doubling it
     */
    private void increaseSize() {
        Item[] temp = new Item[cart.length + 3];

        for (int i = 0; i < cart.length; i++) {
            temp[i] = cart[i];
        }
        cart = temp;
        }
    
    /**
     * When the getTotalPrice method is called, it returns the total price of the items
     */
    public double getTotalPrice(){
        return totalPrice;
    }
    /**
     * returns all the information of the item in the cart.
     */
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String contents = "\nShopping Cart\n";
        contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";
        for (int i = 0; i < itemCount; i++)
            contents += cart[i].toString() + "\n";
        contents += "\nTotal Price: " + fmt.format(totalPrice);
        contents += "\n";
        return contents;
    }
}