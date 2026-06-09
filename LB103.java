// LB Assignment 21
/* 3. Write a program to display all factors of a given number (i am not considering 1 and the number itself as its factor) */

class LB103
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.displayFactors(12);
    }
}

class Logic
{
    void displayFactors(int num)
    {
        int iCnt = 0;

        for(iCnt = 2; iCnt <= num/2; iCnt++)
        {
            if(num % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}