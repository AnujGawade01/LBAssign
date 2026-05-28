/* 2. Accept amount in US dollar and return its corresponding value in Indian currency
Consider 1$ as 70 rupees */
#include<stdio.h>

int DollarToINR(int iNo)
{
    int iCon = 0;
    iCon = 70;

    iNo = iNo * iCon;

    return iNo;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number of USD : \n");
    scanf("%d",&iValue);

    iRet = DollarToINR(iValue);

    printf("Value in INR is %d", iRet);
    
    return 0;
}