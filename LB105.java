// LB Assignment 21
/* 5. Write a program to print all numbers from 1 to N that are divisible by both 2 and 3 */

class LB105
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printDivisibleBy2and3(30);
    }
}

class Logic
{
    void printDivisibleBy2and3(int n)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if(((iCnt % 2) == 0) && ((iCnt % 3) == 0))
            {
                System.out.println(iCnt);
            }
        }
    }
}