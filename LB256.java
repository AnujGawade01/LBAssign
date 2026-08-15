// LB Assignment 52 (48)

/*///////////////////////////////////////////////////////////////////////////////////////

 1. Automatic Fine Calculator for Library

 As per policy student can keep a borowwed book for up to 7 days without any penalty
 If book is returned late the fine depends on how many days the student kept the book in 
 total

 Fine Rules:
    If the book is returned within 7 days -> No Fine
    If total days are 8 to 12             -> Rs.5 per day for each day beyond 7
    If total days more than 12            -> Rs.5 per day for days 8-12
                                          Rs.10 per day for each day beyond 12

Input:
    One integer: total number of days the book was kept(daysKept)

Validations:
    If (daysKept < 0 ) -> invalid input

Expected Output:
    If daysKept <= 7:Returned on time. No fine Applicable
    Else: Total fine to be paid: Rs<fineAmount>

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class LB256
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int daysKept = 0;
        int fineAmount = 0;

        System.out.println("Number of days the student borrowed the book : ");
        daysKept = sobj.nextInt();

        fineAmount = FineCalc(daysKept);

        if(daysKept < 0)
        {
            System.out.println("Invalid Input");
        }
        else if(daysKept <= 7)
        {
            System.out.println("Returned on time. No fine Applicable");
        }
        else
        {
            System.out.println("Total fine to be paid : Rs "+fineAmount);
        }
    }

    public static int FineCalc(int daysKept)
    {
        int fine = 0;
        int i = 0;

        if(daysKept < 0)
        {
            return -1;
        }

        if(daysKept <= 7)
        {
            return fine;
        }
        else if((daysKept > 7) && (daysKept <= 12))
        {
            for(i = 1; i <= (daysKept - 7); i++)
            {
                fine = fine + 5;
            }
        }
        else
        {
            for(i = 1; i <= (12 - 7); i++)
            {
                fine = fine + 5;
            }

            for(i = 1; i <= (daysKept - 12); i++)
            {
                fine = fine + 10;
            }
        }

        return fine;
    }
}