/* 5. Write a program to check whether a number is positive, negative or zero */

class LB90
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.checkSign(-8);
    }
}

class Logic
{
    void checkSign(int num)
    {   

        if(num < 0)
        {
            System.out.println(num+" is negative");
        }
        else if(num == 0)
        {
            System.out.println(num+" is zero");
        }
        else
        {
            System.out.println(num+" is positive");
        }
    }
}