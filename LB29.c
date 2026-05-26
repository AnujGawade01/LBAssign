/* 4. Write a program which accept number from user and display its table */
#include<stdio.h>

void Table(int iNo)
{
    int iCnt = 0;
    int iVal = 0;

    if (iNo < 0) 
    {
        iNo = -iNo;
    }

    for(iCnt = 1, iVal = 1; iCnt <= 10; iCnt++)
    {
        iVal = iNo * iCnt;
        printf("%d\t",iVal);
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    Table(iValue);
    
    return 0;
}