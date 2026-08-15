// LB Assignment 52 (48)

/*///////////////////////////////////////////////////////////////////////////////////////

 2. ATM cash withdrawal

 Rules:
    Withdrawal amount must be a multiple of Rs 100
    Maximum withdrawal per transaction is Rs 25,000
    After withdrawal balance must remain at least Rs 1000

Input:
    Line 1: Current balance(integer)
    Line 2: requested withdrawal amount(integer)

Validations:
    If (balance < 0) or (withdrawAmount <= 0) -> Invalid input

Expected Output:

    If Successful: 
    Transaction successful.
    Remaining Balance: Rs<newBalance>

    If Failed:
    Transaction Failed: <Reason>

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB257
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int balance = 0;
        int withdrawAmount = 0;

        int newBalance = 0;

        System.out.println("Enter Current Balance : ");
        balance = sobj.nextInt();

        System.out.println("Enter requested Withdrawal amount : ");
        withdrawAmount = sobj.nextInt();

        AtmSys aobj = new AtmSys();

        newBalance = aobj.Withdrawal(balance,withdrawAmount);

        if(newBalance == -3)
        {
            System.out.println("Invalid Input");
        }
        else if(newBalance == -4)
        {
            System.out.println("Transaction Failed: Withdrawal amount must be in a multiple of Rs 100");
        }
        else if(newBalance == -5)
        {
            System.out.println("Transaction Failed: Maximum withdrawal per transaction is Rs 25,000");
        }
        else if(newBalance == -6)
        {
            System.out.println("Transaction Failed: After withdrawal balance must remain at least Rs 1000");
        }
        else
        {
            System.out.println("Transaction successful.");
            System.out.println("Remaining Balance: Rs "+newBalance);
        }
    }
}

class AtmSys
{
    public int Withdrawal(int bal, int withdrawAmt)
    {
        int newBal = 0;

        if((bal < 0) || (withdrawAmt <= 0))
        {      
            return -3;
        }

        if((withdrawAmt % 100) != 0)
        {
            return -4;
        }

        if(withdrawAmt > 25000)
        {
            return -5;
        }

        newBal = bal - withdrawAmt;

        if(newBal < 1000)
        {
            return -6;
        }

        return newBal;
    }
}