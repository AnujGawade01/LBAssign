/* 5. Write a program which accept number from user and display its table in reverse order */
#include<stdio.h>

void TableRev(int iNo)
{
    int iCnt = 0;
    int iVal = 0;

    if (iNo < 0) 
    {
        iNo = -iNo;
    }

    for(iCnt = 10, iVal = 1; iCnt > 0; iCnt--)
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

    TableRev(iValue);
    
    return 0;
}