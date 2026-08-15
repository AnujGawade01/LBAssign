// LB Assignment 52 (48)

/*///////////////////////////////////////////////////////////////////////////////////////

 5. E-Commerce platform Pay

 Discounts are based on purchase amount

 Discount Rules:
    Amount > 5000   -> 20% discount
    Amount > 2000   -> 10% discount
    Otherwise       -> no discount
    Premium members -> extra 5% discount on the discounted amount

Input:
    Purchase amount(integer)
    Membership type: Premium/Regular

Validations:
    Amount must be > 0
    Membership must be valid

Expected Output:
    Original Amount: Rs<amount>
    Total Discount: <discount>
    Total Payable Amount: Rs<finalAmount>

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB260
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int amount = 0;
        String MemberType = "";
        int DiscAmt = 0;
        int finalAmount = 0;

        System.out.println("Enter the purchase amount : ");
        amount = sobj.nextInt();

        sobj.nextLine(); 

        System.out.println("Membership type : ");
        MemberType = sobj.nextLine();

        EComm eobj = new EComm();
        finalAmount = eobj.FinalBill(amount,MemberType);

        DiscAmt = eobj.Discount(amount,finalAmount);

        if(finalAmount == -1)
        {
            System.out.println("Error: Amount must be > 0");
        }
        else if(finalAmount == -2)
        {
            System.out.println("Error: Membership must be valid");
        }
        else
        {
            System.out.println("Original Amount: "+amount);
            System.out.println("Total Discount: "+DiscAmt);
            System.out.println("Total Payable Amount: "+finalAmount);
        }
    }
}

class EComm
{
    public int FinalBill(int amount, String type)
    {
        if(amount < 0)
        {
            return -1;
        }

        if( (!type.equals("Premium")) || (!type.equals("Premium")) || (!type.equals("Premium")) || (!type.equals("Premium")) )
        {
            return -2;
        }

        int finalAmt = amount;

        if(amount > 5000)
        {
            finalAmt = (amount / 100) * (100 - 20);
        }
        else if(amount > 2000)
        {
            finalAmt = (amount / 100) * (100 - 10);
        }
        
        if((type.equals("Premium")) || (type.equals("premium")))
        {
            finalAmt = (finalAmt/100) * (100 - 5);
        }

        return finalAmt;
    }

    public int Discount(int amount, int finalAmount)
    {
        int discount = 0;

        discount = amount - finalAmount;

        return discount;
    }
}