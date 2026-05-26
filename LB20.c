// 5. Write a program which accept a number from user and return difference between summation of all its factors and non factors
#include<stdio.h>

int FactDiff(int iNo)
{
    int iCnt = 0; 
    int iSumNotFact = 0;
    int iSumFact = 0;
    int iVal = 0;
    
    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        if((iNo % iCnt) != 0)
        {
            iSumNotFact = iCnt + iSumNotFact;
        }
    }

    for(iCnt = 1; iCnt <= iNo/2; iCnt++)
    {
        if((iNo % iCnt) == 0)
            {
                iSumFact = iCnt + iSumFact;
            }
        }

    iVal = iSumFact - iSumNotFact;

    return iVal;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = FactDiff(iValue);

    printf("%d",iRet);

    return 0;
}
