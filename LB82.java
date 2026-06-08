/* 2. Write a program to check whether a number is palindrome or not */

class LB82
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.checkPalindrome(121);
    }
}

class Logic
{
    void checkPalindrome(int num)
    {
        int iRev = 0;
        int iTemp = num;

        while(num != 0)
        {
            iRev = (iRev * 10) + (num % 10);
            num = num / 10;
        }

        if(iTemp == iRev)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is no a palindrome");
        }
    }
}

