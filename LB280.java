// LB Assignment 56 (52)

/*///////////////////////////////////////////////////////////////////////////////////////

5 . A telecom company bills calls based on duration slabs. The system needs to calculate 
final charge for a given call duration

Rules:
    First 5 minutes free
    Next 10 minutes (6-15) -> Rs 1 per minute
    Beyond 15 -> Rs 2 per minute

Input:
    call duration in minutes (integer)

Validations:
    Minutes must be >= 0

Expected Output:
    Call Duration: <minutes> minutes
    Total Call Charges: Rs<amount>

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB280
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0;
        int CallTime = 0;

        int BillCharge = 0;
        
        System.out.println("--------------Call Charges--------------");

        System.out.println("Enter the duration of Call (in Minutes): ");
        CallTime = sobj.nextInt();

        if(CallTime < 0)    // Validation
        {
            System.out.println("Error: Call Time cannot be negative");
            return;
        }
        
        Telecom tobj = new Telecom();   // class object
        BillCharge = tobj.Bill(CallTime);

        System.out.println("Call Duration: " +CallTime+" minutes");
        System.out.println("Total Call Charges: Rs "+BillCharge);
        
    }
}

class Telecom
{
    public int Bill(int CallDuration)
    {
        int Charges = 0;
        int i = 0;

        if(CallDuration <= 5)
        {
            Charges = 0;
        }
        else if((CallDuration > 5) && (CallDuration <= 15))
        {
            Charges = (CallDuration-5) * 1;
        }
        else
        {
            Charges = 10;
            for(i = 1; i <= (CallDuration - 15); i++)
            {
                Charges = Charges + 2;
            }
        }

        return Charges;
    }
}
