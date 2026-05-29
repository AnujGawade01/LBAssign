/* 5. Write a program which accept range from user and display all numbers in between that range in reverse order */
#include<stdio.h>

void RangeDisplayRev(int iStart, int iEnd)
{
    int iCnt = 0;
    int iSum = 0;

    if(iStart > iEnd) 
    {
        printf("Invalid range\n");
        return;
    }

    for(iCnt = iEnd; iCnt >= iStart; iCnt--)
    {   
        printf("%d\t",iCnt);
    }
}

int main()
{
    int iValue1 = 0, iValue2 = 0, iRet = 0;

    printf("Enter starting point : \n");
    scanf("%d",&iValue1);

    printf("Enter ending point : \n");
    scanf("%d",&iValue2);

    RangeDisplayRev(iValue1, iValue2);
    
    return 0;
}