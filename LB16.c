// LB Assignment 4
// 1. Write a program that accept a number from user and display its multiplication of factors
#include<stdio.h>

int MultFact(int iNo)
{
    int iCnt = 0; 
    int iVal = 1;
    for(iCnt = 1; iCnt <= iNo/2; iCnt++)
    {
        if((iNo % iCnt) == 0)
        {
            iVal = iCnt * iVal;
        }
    }

    return iVal;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = MultFact(iValue);

    printf("%d",iRet);

    return 0;
}
