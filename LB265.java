// LB Assignment 53 (49)

/*///////////////////////////////////////////////////////////////////////////////////////

 5. Income Tax Calculator

 Slabs:
    Up to Rs 2,50,000 -> 0 %
    Rs 2,50,000 to Rs 5,00,000 -> 5%
    Rs 5,00,000 to Rs 10,00,000 -> 20 %
    Above Rs 10,00,000 -> 30 %

Input:
    Annual Income (integer)

Validations:
    Income cannot be negative

Expected Output:
    Annual Income: Rs<income>
    Total Tax Payable: Rs<tax>

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB265
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int AnnualIncome = 0;

        int iRet = 0;

        System.out.println("Enter your Annual Income : ");
        AnnualIncome = sobj.nextInt();

        IncomeTax iobj = new IncomeTax();
        iRet = iobj.TaxCalc(AnnualIncome);

        if(iRet == -1)
        {
            System.out.println("Error : Income cannot be negative");
        }
        else
        {
            System.out.println("Annual Income: Rs " + AnnualIncome);
            System.out.println("Total Tax Payable: Rs " + iRet);
        }
    }
}

class IncomeTax
{
    public int TaxCalc(int Income)
    {
        if (Income < 0) 
        {
            return -1;
        }

        int tax = 0;

        if(Income <= 250000)
        {
            tax = 0;
        }
        else if(Income <= 500000)
        {
            tax = (int) ((Income - 250000)*0.05);
        }
        else if (Income <= 1000000)
        {
            // 5% of maximum amount in previous slab (2,50,000 * 0.05 = 12500)
            tax = 12500 + (int) ((Income - 500000) * 0.20);
        }
        else 
        {
            // 12500 (from 2nd slab) + 100000 (from 3rd slab: 5,00,000 * 0.20) = 112500
            tax = 112500 + (int) ((Income - 1000000) * 0.30);
        }

        return tax;
    }
}