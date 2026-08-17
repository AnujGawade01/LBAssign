// LB Assignment 53 (49)

/*///////////////////////////////////////////////////////////////////////////////////////

 1. Shopping Mall Parking System

 Rules:
    First 2 hours -> Rs 20 (flat)
    After 2 hours -> Rs 10 per extra hour
    If (total hours > 10) -> add Rs 50 penalty

Input:
    Total parking hours (integer)

Validations:
    Hours cannot be negative

Expected Output:
    Total Parking Duration: <hours> hours
    Total Parking Fee: Rs<amount>

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB261
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int duration = 0;
        int iRet = 0;

        System.out.println("Enter the parking duration in hours : ");
        duration = sobj.nextInt();

        ParkingSystem pobj = new ParkingSystem();

        iRet = pobj.FeeCalc(duration);

        if(iRet == -1)
        {
            System.out.println("Error: Hours cannot be negative");
        }
        System.out.println("Total Parking Duration: "+duration);
        System.out.println("Total Parking Fee: Rs "+iRet);
    }
}

class ParkingSystem
{
    public int FeeCalc(int ParkDuration)
    {
        if(ParkDuration < 0)
        {
            return -1;
        }

        int amount = 0;
        int i = 0;

        if(ParkDuration < 2)
        {
            amount = amount + 20;
        }
        else if((ParkDuration > 2) && (ParkDuration <= 10))
        {
            amount = amount + 20;

            for(i = 1; i <= (ParkDuration-2); i++)
            {
                amount = amount + 10;
            }
        }
        else
        {
            amount = amount + 20;

            for(i = 1; i <= (ParkDuration-2); i++)
            {
                amount = amount + 10;
            }

            amount = amount + 50;
        }

        return amount;
    }
}