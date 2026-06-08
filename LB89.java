/* 4. Write a program to find sum of even and odd digits separately in a number */

class LB89
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.sumEvenOddDigits(123456);
    }
}

class Logic
{
    void sumEvenOddDigits(int num)
    {   
        int iOddSum = 0, iEvenSum = 0, iDigit = 0, iDiff = 0;


        while(num != 0)
        {
            iDigit = num % 10;
            
            if((num % 2) == 0)
            {
                iEvenSum = iEvenSum + iDigit;
            }
            else
            {
                iOddSum = iOddSum + iDigit;
            }

            num = num / 10;
        }

        iDiff = iEvenSum - iOddSum;

        System.out.println("Difference is : "+iDiff);
    }
}