// LB Assignment 21
/* 4. Write a program to count total number of factors of a given number (i am not considering 1 and the number itself as its factor) */

class LB104
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.countFactors(20);
    }
}

class Logic
{
    void countFactors(int num)
    {
        int iCnt = 0, iCount = 0;

        for(iCnt = 2; iCnt <= num/2; iCnt++)
        {
            if(num % iCnt == 0)
            {
                iCount++;
            }
        }

        System.out.println("Number of factors of the number are : "+iCount);
    }
}