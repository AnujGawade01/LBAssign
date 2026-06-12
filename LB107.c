// LB Assignment 22
/* 2. Accept number from user and display below pattern
5
5 # 4 # 3 # 2 # 1 #
 */

#include<stdio.h>

void Pattern(int iNo)
{
    int iCnt = 0;

    for(iCnt = iNo; iCnt > 0; iCnt--)
    {
        printf("%d\t#\t",iCnt);
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