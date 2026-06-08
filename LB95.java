/* 5. Write a program to calculate the power of a number using loops */

class LB95
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.calculatePower(2, 5);
    }
}

class Logic
{
    void calculatePower(int base, int exp)
    {
        int iCnt = 0; 
        long iRes = 1;

        for(iCnt = 1; iCnt <= exp; iCnt++)
        {
            iRes = base * iRes;
        }

        System.out.println("Power of number is "+iRes);
    }
}
