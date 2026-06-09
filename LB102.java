// LB Assignment 21
/* 2. Write a program to count how many even and odd numbers are present between 1 and N */

class LB102
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.countEvenOddRange(50);
    }
}

class Logic
{
    void countEvenOddRange(int n)
    {
        int iCnt = 0, iCountEven = 0, iCountOdd = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iCountEven++;
            }
            else
            {
                iCountOdd++;
            }

        }

        System.out.println("Count of Odd numbers is : "+iCountOdd);
        System.out.println("Count of Even numbers is : "+iCountEven);
    }
}