// LB Assignment 17
/* 1. Write a program to find sum of digits of a number */

class LB81
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.sumOfDigits(1234);
    }
}

class Logic
{
    void sumOfDigits(int num)
    {
        int iSum = 0;

        while(num != 0)
        {
            iSum = iSum + num % 10;
            num = num / 10;
        }

        System.out.println("Sum of digits of a number is : "+iSum);
    }
}

