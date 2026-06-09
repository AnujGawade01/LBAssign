// LB Assignment 20
/* 2. Write a program to print numbers from N down to 1 in reverse order */

class LB97
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printReverse(10);
    }
}

class Logic
{
    void printReverse(int n)
    {
        int iCnt = 0;

        for(iCnt = n; iCnt > 0; iCnt--)
        {
            System.out.println(iCnt);
        }

    }
}
