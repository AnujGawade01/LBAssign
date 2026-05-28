/* 3. Write a program to find even factorial of a number */
#include<stdio.h>

int EvenFactorial(int iNo)
{
    int iCnt = 0;
    int iVal = 0;

    if (iNo < 0) 
    {
        iNo = -iNo;
    }

    for(iCnt = 1, iVal = 1; iCnt <= iNo; iCnt++)
    {
        if((iCnt % 2) == 0)
        {
            iVal = iCnt * iVal;
        }
    }
    return iVal;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = EvenFactorial(iValue);

    printf("Even Factorial of number is %d", iRet);
    
    return 0;
}