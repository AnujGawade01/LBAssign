// LB Assignment 52 (48)

/*///////////////////////////////////////////////////////////////////////////////////////

 4. Accurate Electricity company billing 

 The billing is progressive, meaning units are charged in slabs

 Slabs:
    First 100 units -> Rs 5 per unit
    Next 100 units (101-200) -> Rs 7 per unit
    Above 200 units -> Rs 10 per unit

Input:
    One integer: units consumed

Validations:
    Units cannot be negative

Expected Output:
    Total Units Consumed: <units>
    Total Electricity Bill: Rs<amount>

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB259
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int unit = 0;
        int BillAmt = 0;

        System.out.println("Number of units consumed : ");
        unit = sobj.nextInt();

        Electricity eobj = new Electricity();

        BillAmt = eobj.ElecBill(unit);

        if(BillAmt ==  -1)
        {
            System.out.println("Error: Units cannot be negative");
        }
        else
        {
            System.out.println("Total Units Consumed : "+unit);
            System.out.println("Total Electricity Bill : "+BillAmt);
        }
    }
}

class Electricity
{
    public int ElecBill(int unit)
    {
        if(unit < 0)
        {
            return -1;
        }

        int iRet = 0;
        int i = 0;

        if(unit <= 100)
        {
            for(i = 1; i <= unit; i++)
            {
                iRet = iRet + 5;
            }
        }
        else if((unit >= 101) && (unit <= 200))
        {
            for(i = 1; i <= unit; i++)
            {
                if(i <= 100)
                {
                    iRet = iRet + 5;
                }

                if((i >= 101) && (i <= 200))
                {
                    iRet = iRet + 7;
                }   
            }
        }
        else
        {
            for(i = 1; i <= unit; i++)
            {
                if(i <= 100)
                {
                    iRet = iRet + 5;
                }

                if((i >= 101) && (i <= 200))
                {
                    iRet = iRet + 7;
                }   

                if((i > 200))
                {
                    iRet = iRet + 10;
                }   
            }   
        }
        return iRet;
    }
}