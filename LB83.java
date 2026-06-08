/* 3. Write a program to find maximum of two numbers */

class LB83
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.findMax(20, 15);
    }
}

class Logic
{
    void findMax(int a, int b)
    {
        int iMax = 0;

        if(a > b)
        {
            iMax = a;
        }
        else
        {
            iMax = b;
        }

        System.out.println("Maximum among two numbers is : "+iMax);
    }
}
