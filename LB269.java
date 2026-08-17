// LB Assignment 54 (50)

/*///////////////////////////////////////////////////////////////////////////////////////

 4. Customer Budget - store orders calculator

Input:
    Budget amount
    Number of items N
    N item prices

Validations:
    Budget >= 0
    N >= 0
    Each price > 0

Expected Output:
    Items Purchased: <count>
    Remaining Balance: Rs <amount>

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB269
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int Budget = 0;
        int ItemsNo = 0;
        int iNoPrice[] = null;
        int i = 0;

        
        System.out.println("Enter the budget : ");
        Budget = sobj.nextInt();

        System.out.println("Enter the No of items to be purchased : ");
        ItemsNo = sobj.nextInt();

        if(ItemsNo > 0) 
        {
            iNoPrice = new int[ItemsNo];
            System.out.println("Enter the price of each item : ");
            for(i = 0; i < ItemsNo; i++)
            {
                iNoPrice[i] = sobj.nextInt();
            }
        }
        else
        {
            iNoPrice = new int[0]; 
        }


        Store strobj = new Store();
        int amount[] = strobj.BudgetCalc(Budget,ItemsNo,iNoPrice);

        if(amount[0] == -1)
        {
            System.out.println("Error: Budget cannot be negative");
        }
        else if(amount[0] == -2)
        {
            System.out.println("Error: No. of items cannot be negative");
        }
        else if(amount[0] == -3)
        {
            System.out.println("Error: Price of an item cannot be negative");
        }
        else
        {
            System.out.println("Items Purchased: "+amount[0]);
            System.out.println("Remaining Balance: Rs "+amount[1]);
        }
    }
}

class Store
{
    public int[] BudgetCalc(int Budget, int ItemsNo, int[] iNoPrice) 
    {

        int i = 0;
        
        // Validation
        if(Budget < 0)
        {
             return new int[]{-1, 0};
        }
        if(ItemsNo < 0)
        {
            return new int[]{-2, 0};
        }

        int TotalBill = 0;

        for(i = 0; i < ItemsNo; i++)
        {     
            if(iNoPrice[i] <= 0)
            {
                return new int[]{-3, 0};
            }
        }

        Arrays.sort(iNoPrice); // Maximize number of items purchased
        
        int purchasedCount = 0;
        int remainingBudget = Budget;
        
        for(i = 0; i < ItemsNo; i++) 
        {
            if(remainingBudget >= iNoPrice[i]) 
            {
                remainingBudget -= iNoPrice[i];
                purchasedCount++;
            } 
            else 
            {
                break; // Cannot afford any more items
            }
        }
        
        return new int[]{purchasedCount, remainingBudget};
    }
}