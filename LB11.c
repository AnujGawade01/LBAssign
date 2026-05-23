// LB Assignment 3
// 1. Write a program which accept one number from user and print that number of even numbers on screen.
#include<stdio.h>

void PrintEven(int iNo)
{
    if(iNo <= 0)
    {
        return ;
    }
    
    int iCnt = 0;
    int iNum = 0;
    for(iCnt = 1 ; iCnt <= iNo; iCnt++)
    {
        iNum = iNum + 2;
        printf("%d\n",iNum);

    }
}

int main()
{
    int iValue = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    PrintEven(iValue);

    return 0;
}