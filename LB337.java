// LB Assignment 68 (64)

/*///////////////////////////////////////////////////////////////////////////////////////

3 . An e-commerce warehouse maintains:

Product ID -> Available Quantity

Implement Operations:
 
 ADD 101 50
 ADD 102 30
 SELL 101 5
 RESTOCK 102 20
 SEARCH 101

Expected Output: 

 Product 101 available quantity : 45

If a product doesn't exist, display an appropriate message 

/*///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class LB337
{
    public static void main(String A[])
    {
        HashMap <Integer, Integer> inventory = new HashMap <Integer, Integer> ();

        //ADD 101 50
        inventory.put(101,50);

        //ADD 102 30
        inventory.put(102,30);

        //SELL 101 5
        inventory.put(101,50);
        if(inventory.containsKey(101))
        {
            inventory.put(101, inventory.get(101) - 5);
        }

        //RESTOCK 102 20
        if(inventory.containsKey(102))
        {
            inventory.put(101, inventory.get(101) + 20);
        }

        int productid = 101;

        if(inventory.containsKey(productid))
        {
            System.out.println("Product "+productid+" available quantity : "+inventory.get(productid));
        }
        else
        {
            System.out.println("Product not found");
        }

    }
}