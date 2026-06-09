// LB Assignment 20
/* 4. Write a program to find the largest digit in a given number */

class LB99
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.findLargestDigit(83429);
    }
}

class Logic
{
    void findLargestDigit(int num)
    {
        int iDigit = 0;

        while(num != 0)
        {
            if(iDigit < (num % 10))
            {
                iDigit = num % 10;
            }
            num = num / 10;
        }

        System.out.println("Largest digit in the number is : "+iDigit);
    }
}