// LB Assignment 54 (50)

/*///////////////////////////////////////////////////////////////////////////////////////

 3. Courier Charge Calculator

 Charges:
    Up to 1 kg -> Rs 50
    1-5 kg -> Rs 50 + Rs 20/kg above 1 kg
    Above 5 kg -> Rs 150 + Rs 30/kg above 5 kg

Input:
    Parcel weight in kg(integer)

Validations:
    Weight must be > 0

Expected Output:
    Parcel Weight: <weight> kg
    Courier Charge: Rs<amount>

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB268
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int ParcelWeight = 0;

        int Charges = 0;
        
        System.out.println("Enter the weight of parcel in kg : ");
        ParcelWeight = sobj.nextInt();

        Courier cobj = new Courier();
        Charges = cobj.ChargeCalc(ParcelWeight);

        if(Charges == -1)
        {
            System.out.println("Error: Weight cannot be negative");
        }
        else
        {
            System.out.println("Parcel Weight: "+ParcelWeight+" kg");
            System.out.println("Courier Charge: Rs "+Charges);
        }

        
    }
}

class Courier
{
    public int ChargeCalc(int Weight) 
    {
        // Validation
        if (Weight <= 0)
        {
            return -1;
        }

        int ParcelCharge = 0;
        int i = 0;

        if(Weight <= 1)
        {
            ParcelCharge = 50;
        }
        else if((Weight > 1) && (Weight <= 5))
        {   
            ParcelCharge = 50;

            for(i = 1; i <= (Weight-1); i++)
            {
                ParcelCharge = ParcelCharge + 20;
            }
        }
        else if(Weight > 5)
        {
            ParcelCharge = 150;

            for(i = 1; i <= (Weight-5); i++)
            {
                ParcelCharge = ParcelCharge + 30;
            }
        }
        

        return ParcelCharge;
    }
}