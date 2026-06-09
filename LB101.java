// LB Assignment 21
/* 1. Write a program to calculate the product of digits of a number */

class LB101
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.productOfDigits(234);
    }
}

class Logic
{
    void productOfDigits(int num)
    {
        int iDigit = 0, iSum = 0;

        iSum = 1;

        while(num != 0)
        {
            iDigit = num % 10;
            iSum = iSum * iDigit;
            num = num / 10;
        }

        System.out.println("Product of digits is : "+iSum);
    }
}