// LB Assignment 22
/* 1. Accept number from user and display below pattern
5
A B C D E
 */

#include<stdio.h>

void Pattern(int iNo)
{
    int iCnt = 0;
    char iCh = 'A';

    for(iCnt = 0; iCnt < iNo; iCnt++)
    {
        printf("%c\t",iCh);
        iCh++;
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number of elements: \n");
    scanf("%d",&iValue);

    Pattern(iValue);

    return 0;
}