/* 5. Write a program to print multiplication table of a number */

class LB85
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printTable(5);
    }
}

class Logic
{
    void printTable(int num)
    {
        int iVal = 0;
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {   
            iVal = num * iCnt;
            System.out.println(iVal);
        }
    }
}
