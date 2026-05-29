/* 5. Write a program which accepts number from user and returns difference between summation of even digits and summation of odd digits. */
#include<stdio.h>

int CountDiff(int iNo)
{
    int iEven = 0;
    int iOdd = 0;
    int iRet = 0;

    int iDigit = 0;

    if (iNo < 0) 
    {
        iNo = -iNo;
    }
    
    while(iNo > 0)
    {
        iDigit = iNo % 10;
        if((iDigit % 2) == 0)
        {
            iEven = iEven + iDigit;
        }
        else
        {
            iOdd = iOdd + iDigit;
        }
        iNo = iNo / 10; 
    }

    iRet = iEven - iOdd;

    return iRet;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = CountDiff(iValue);

    printf("%d\n", iRet);
    
    return 0;
}