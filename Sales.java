/**
 * Calculate the amount of salespeople, find the max, min, and average
 * as well as total sales.
 * @version 11/9/2017
 * @author Joseph Rosenberry
 */
import java.util.*;
public class Sales
{
    public static void main(String[] args)
    {
        System.out.println("\f");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter amount of salespeople ");
        int salespeople = scan.nextInt();
        System.out.println("\n");
        int[] sales = new int[salespeople];
        int sum, max = 0, min = 0, maxSalesPerson = 0, minSalesPerson = 0;
        for (int i=0; i < sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": $");
            sales[i] = scan.nextInt();
            if ( i ==0 ){
                min = sales[i];
                max = sales[i];
            }
            if ( sales [i] > max ) {
                max = sales[i];
                maxSalesPerson = (i + 1);
            }
            if ( sales[i] < min ){
                min = sales[i];
                minSalesPerson = (i + 1);
            }
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i < sales.length; i++)
        {
            System.out.println((i + 1)  + "\t\t$" + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: $" + String.format("%.2f",(double)sum));
        System.out.println("\nAverage Sales: $" +  String.format("%.2f",(double) sum/salespeople));
        System.out.println("\nSalesperson " + maxSalesPerson +  " had the highest sale with $" + String.format("%.2f", (double)max));
        System.out.println("\nSalesperson " + (minSalesPerson + 1) + " had the least sales with $" + String.format("%.2f", (double)min));

    }
}