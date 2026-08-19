// LB Assignment 56 (52)

/*///////////////////////////////////////////////////////////////////////////////////////

1. A hotel charges Rs 3000 per day. For long stays, hotel provides discount to retain customers

Rules: 
    Rs 3000/day
    If stay > 7 days -> 5% discount on total bill

Input:
    Number of days stayed

Validations:
    Days must be >= 0 

Expected Output:
    Total Stay Duration: <days> days
    Final Bill Amount: Rs <amount>

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB276
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int Days = 0;

        System.out.println("Enter the number of days: ");
        Days = sobj.nextInt();

        Hotel hobj = new Hotel();

        int bill = hobj.HotelBilling(Days);

        if(bill == -1)
        {
            System.out.println("Error: Number of days should be in positive number");   
        }
        else
        {
            System.out.println("Total Stay Duration: "+Days);
            System.out.println("Final Bill Amount: "+bill);
        }

        sobj.close();
    }
}

class Hotel
{
    public int HotelBilling(int Days)
    {
        if(Days < 0)
        {
            return -1;
        }

        int Ret = 0;

        Ret = Days * 3000;

        if(Days > 7)
        {
            Ret = (int)(Ret * 0.95);
        }

        return Ret;
    }
}