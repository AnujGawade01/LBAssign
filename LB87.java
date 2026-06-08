/* 2. Write a program to print all even numbers up to N */

class LB87
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printEvenNumbers(20);
    }
}

class Logic
{
    void printEvenNumbers(int n)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if((iCnt%2) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

