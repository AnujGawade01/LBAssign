/* 5. Write a program which returns difference between Even factorial and odd factorial of a given number */
#include<stdio.h>

int FactorialDiff(int iNo)
{
    int iCnt = 0;
    int iRetVal = 0;
    int iEvenFact = 0;
    int iOddFact = 0;

    if (iNo < 0) 
    {
        iNo = -iNo;
    }

    for(iCnt = 1, iEvenFact = 1; iCnt <= iNo; iCnt++)
    {
        if((iCnt % 2) == 0)
        {
            iEvenFact = iCnt * iEvenFact;
        }
    }

    for(iCnt = 1, iOddFact = 1; iCnt <= iNo; iCnt++)
    {
        if((iCnt % 2) != 0)
        {
            iOddFact = iCnt * iOddFact;
        }
    }

    iRetVal = iEvenFact - iOddFact;

    return iRetVal;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = FactorialDiff(iValue);

    printf("Factorial difference is %d", iRet);
    
    return 0;
}