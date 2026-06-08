// LB Assignment 18
/* 1. Write a program to check whether a number is prime or not */

class LB86
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.checkPrime(11);
    }
}

class Logic
{
    void checkPrime(int num)
    {
        int iCnt = 0;
        boolean bFlag = false;

        for(iCnt = 2; iCnt < num; iCnt++)
        {
            if(num % iCnt != 0)
            {
                bFlag = true;
                break;
            }
            else
            {
                bFlag = false;
            }
        }

        if(bFlag == true)
        {
            System.out.println("It is not a prime number");
        }
        else
        {
            System.out.println("It is a prime number");
        }
    }
}

