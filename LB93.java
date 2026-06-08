/* 3. Write a program to check whether a number is divisible by 5 and 11 or not */

class LB93
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.checkDivisible(55);
    }
}

class Logic
{
    void checkDivisible(int num)
    {
        if((num % 5 == 0) && (num % 11 == 0))
        {
            System.out.println("Number is divisible");
        }
        else
        {
            System.out.println("Number is not divisible");
        }
    }
}

