/* 4. Write a program to print each digit of number separately */

class LB94
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printDigits(9876);
    }
}

class Logic
{
    void printDigits(int num)
    {
        int iCnt = 0, iDigit = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            System.out.println(iDigit);
            num = num / 10;
        }
    }
}
