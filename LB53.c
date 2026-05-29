/* 3. Write a program which accept range from user and return addition of all numbers in between that range
(Range should contain positive numbers only) */
#include<stdio.h>

int RangeSum(int iStart, int iEnd)
{
    int iCnt = 0;
    int iSum = 0;

    /*if(iStart < 0)  // To convert negative Start point to positive
    {
        iStart = -iStart;
    }

    if(iEnd < 0)
    {
        iEnd = -iEnd; // To convert negative End point to positive
    }*/


    if(iStart > iEnd || iStart < 0 || iEnd < 0) 
    {
        printf("Invalid range\n");
        return -1;
    }

    for(iCnt = iStart; iCnt <= iEnd; iCnt++)
    {   
        iSum = iSum + iCnt;
    }

    return iSum;
}

int main()
{
    int iValue1 = 0, iValue2 = 0, iRet = 0;

    printf("Enter starting point : \n");
    scanf("%d",&iValue1);

    printf("Enter ending point : \n");
    scanf("%d",&iValue2);

    iRet = RangeSum(iValue1, iValue2);
    if(iRet != -1)
    {
        printf("Addition is %d\n",iRet);
    }
    
    return 0;
}