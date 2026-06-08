/* 4. Write a program to find minimum of three numbers */

class LB84
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.findMin(3, 7, 2);
    }
}

class Logic
{
    void findMin(int a, int b, int c)
    {
        int iMin = a;

        if(b < iMin)
        {
            iMin = b;
        }
        
        if(c < iMin)
        {
            iMin = c;
        }

        System.out.println("Minimum is : "+iMin);
    }
}
