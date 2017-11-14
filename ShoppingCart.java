import java.text.NumberFormat;
public class ShoppingCart
{
    private int itemCount; // total number of items in the cart
    private double totalPrice; // total price of items in the cart
    private int capacity; // current cart capacity
    private Item[] cart;
    // -----------------------------------------------------------
    // Creates an empty shopping cart with a capacity of 5 items.
    // -----------------------------------------------------------
    public ShoppingCart()
    {
        capacity = 5;
        itemCount = 0;
        totalPrice = 0.0;
        cart = new Item[capacity];
    }
    // -------------------------------------------------------
    // Adds an item to the shopping cart.
    // -------------------------------------------------------
    public void addToCart(String itemName, double unitPrice, int quantity)
    {
        cart[itemCount] = new Item(itemName, unitPrice, quantity);
        totalPrice += (unitPrice * quantity);
        itemCount++;

    }
    
    public double getTotalPrice(){
        return totalPrice;
    }
    // -------------------------------------------------------
    // Returns the contents of the cart together with
    // summary information.
    // -------------------------------------------------------
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