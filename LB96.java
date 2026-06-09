// LB Assignment 20
/* 1. Write a program to find the sum of all even numbers up to N */

class LB96
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.sumEvenNumbers(10);
    }
}

class Logic
{
    void sumEvenNumbers(int n)
    {
        int iCnt = 0;
        int iTemp = 0;

        for(iCnt = 0; iCnt <= n; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iTemp = iTemp + iCnt;                
            }
        }

        System.out.println("Sum of all even numbers is : "+iTemp);

    }
}

