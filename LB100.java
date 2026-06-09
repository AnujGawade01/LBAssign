// LB Assignment 20
/* 5. Write a program to find the smallest digit in a given number */

class LB100
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.findSmallestDigit(45872);
    }
}

class Logic
{
    void findSmallestDigit(int num)
    {
        int iDigit = 0;

        iDigit = num % 10;

        while(num != 0)
        {
            if((num % 10) < iDigit)
            {
                iDigit = num % 10;
            }
            num = num / 10;
        }

        System.out.println("Smallest digit in the number is : "+iDigit);
    }
}