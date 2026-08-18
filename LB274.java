// LB Assignment 55 (51)

/*///////////////////////////////////////////////////////////////////////////////////////

4. Water Bill with progressive slab + late fees
   Slabs + fixed meter charge. If paid after due date add 2% penalty per week(max 10%)

Input:
    units, weeksLate

Output:
    billAmount

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB274 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter water units consumed: ");
        int units = sobj.nextInt();

        System.out.print("Enter number of weeks late: ");
        int weeksLate = sobj.nextInt();

        WaterBillCalculator robj = new WaterBillCalculator();
        int totalBill = robj.calculateBill(units, weeksLate);

        System.out.println("Total Payable Bill Amount: " + totalBill);

        sobj.close();
    }
}

class WaterBillCalculator 
{
    public int calculateBill(int units, int weeksLate) 
    {
        int fixedMeterCharge = 150;
        int baseBill = fixedMeterCharge;

        if (units <= 100) 
        {
            baseBill += units * 5;             // Slab 1: 0 - 100 units @ 5 per unit
        } 
        else if (units <= 250) 
        {
            baseBill += (100 * 5) + ((units - 100) * 7); // Slab 2: 101 - 250 units @ 7 per unit
        } 
        else 
        {
            baseBill += (100 * 5) + (150 * 7) + ((units - 250) * 12); // Slab 3: Above 250 units @ 12 per unit
        }

        int penaltyPercent = weeksLate * 2;
        
        if (penaltyPercent > 10) 
        {
            penaltyPercent = 10;
        }

        int penaltyAmount = (baseBill * penaltyPercent) / 100;
        
        return baseBill + penaltyAmount;
    }
}

