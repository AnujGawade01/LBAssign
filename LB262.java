// LB Assignment 53 (49)

/*///////////////////////////////////////////////////////////////////////////////////////

 2. Bank Loan Eligbility Checker

 Eligibiltiy Conditions:
    Age 21 to 60 inclusive
    Monthly income >= Rs 25000
    Credit score >= 700
    Must NOT have an existing unpaid loan

Input:
    Age
    Monthly income
    Credit score
    Existing unpaid loan (Yes/No)

Validations:
    Age/income/score must be non-negative
    Yes/No must be valid

Expected Output:
    Loan Approved
    OR
    Loan Rejected: <Specific Reason>

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB262
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int Age = 0;
        int Income = 0;
        int CreditScore = 0;
        String ExUpLoan = "";
        int iRet = 0;

        System.out.println("Enter your Age : ");
        Age = sobj.nextInt();

        System.out.println("Enter your Monthly Income : ");
        Income = sobj.nextInt();

        System.out.println("Enter your Credit Score : ");
        CreditScore = sobj.nextInt();

        sobj.nextLine();

        System.out.println("Do you currently have an existing unpaid loan : (Yes/No)");
        ExUpLoan = sobj.nextLine();

        Bank bobj = new Bank();
        iRet = bobj.EligibilityCheck(Age,Income,CreditScore,ExUpLoan);

        if(iRet == -1)
        {
            System.out.println("Error: Age must be non - negative");
        }
        else if(iRet == -2)
        {
            System.out.println("Error: Income must be non - negative");
        }
        else if(iRet == -3)
        {
            System.out.println("Error: Credit Score must be non - negative");
        }
        else if(iRet == -4)
        {
            System.out.println("Error: Give a valid Yes/No");
        }
        else if(iRet == -6)
        {
            System.out.println("Loan Rejected: You have to be of Age 21 to 60");
        }
        else if(iRet == -7)
        {
            System.out.println("Loan Rejected: You have to have income greater than 25000 Rs per month");
        }
        else if(iRet == -8)
        {
            System.out.println("Loan Rejected: You have to have Credit Score greater than or equal to 700");
        }
        else if(iRet == -9)
        {
            System.out.println("Loan Rejected: You must not have an Existing unpaid Loan");
        }
        else
        {
            System.out.println("Loan Approved");
        }
    }
}

class Bank
{
    public int EligibilityCheck(int age, int income, int CreditScr, String ExistingLoan)
    {
        
        if(age < 0)
        {
            return -1;
        }

        if(income < 0)
        {
            return -2;
        }

        if(CreditScr < 0)
        {
            return -3;
        }

        if(!ExistingLoan.equals("Yes") && !ExistingLoan.equals("No"))
        {
            return -4;
        }

        int iRes = 0;

        if((age < 21) || (age > 60))
        {
            return -6;
        }
        else if(income < 25000)
        {
            return -7;
        }
        else if(CreditScr < 700)
        {
            return -8;
        }
        else if(ExistingLoan.equals("Yes"))
        {
            return -9;
        }
        else
        {
            return 10;
        }

    }
}