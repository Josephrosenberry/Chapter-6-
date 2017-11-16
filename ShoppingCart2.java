/**
 * Creates a shopping cart that can extend the size of the cart if the user chooses to
 * @version 11/16/2017
 * @author Joseph Rosenberry
 */
import java.text.NumberFormat;
public class ShoppingCart2
{
    private int itemCount; // total number of items in the cart
    private double totalPrice; // total price of items in the cart
    private int capacity; // current cart capacity
    private Item[] cart;
    /**
     * Creates a shopping cart of 5 items
     */
    public ShoppingCart2()
    {
        capacity = 5;
        itemCount = 0;
        totalPrice = 0.0;
        cart = new Item[capacity];
    }
    /**
     * adds an item to a shopping cart
     */
    public void addToCart(String itemName, double unitPrice, int quantity)
    {
        if (itemCount == capacity){
            increaseSize();
        }
        cart[itemCount] = new Item(itemName, unitPrice, quantity);
        totalPrice += (quantity * unitPrice);
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
       
    
    public double getTotalPrice(){
        return totalPrice;
    }
    /**
     * Returns all the information for the items in the shopping cart
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