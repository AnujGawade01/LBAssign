// LB Assignment 53 (49)

/*///////////////////////////////////////////////////////////////////////////////////////

 3. Warehouse Stock Checker & Updater

 Rules:
    If Requested quantity > available stock -> order fails
    Else deduct quality
    If remaining stock < 5 -> print low stock alert

Input:
    Current stock(integer)
    Requested quantity(integer)

Validations:
    Stock cannot be negative
    Requested quantity must be > 0

Expected Output:
    If successful:
    Order Processed Successfully.
    Remaining Stock: <Value>

    If remaining < 5 also print: 
    Low Stock Alert!
    
    If failed: 
    Order Failed: Insufficient Stock

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB263
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int CurrStock = 0;
        int ReqQuantity = 0;
        String sRet = "";

        System.out.println("Enter Current product stock : ");
        CurrStock = sobj.nextInt();

        System.out.println("Enter Required Quantity : ");
        ReqQuantity = sobj.nextInt();

        WareHouse wobj = new WareHouse();
        sRet = wobj.StockCheck(CurrStock,ReqQuantity);

        System.out.println(sRet);

    }
}

class WareHouse
{
    public String StockCheck(int Stock, int Quantity)
    {
        
        if(Stock < 0)
        {
            return "Stock cannot be negative";
        }

        if(Quantity < 0)
        {
            return "Requested Quantity must be > 0";
        }

        if (Quantity > Stock) 
        {
            return "Order Failed: Insufficient Stock";
        }

        int RemainingStock = Stock - Quantity;

        String result = "Order Processed Successfully. Remaining Stock: " + RemainingStock;
        
        if (RemainingStock < 5) 
        {
            result += "\nLow Stock Alert!";
        }
        
        return result;

    }
}