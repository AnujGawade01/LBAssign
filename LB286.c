// LB Assignment 58 (54)

/*///////////////////////////////////////////////////////////////////////////////////////

4 . Write a program to check whether a given number is a Harshad Number or not.

Description:
    A number is called Harshad Number if it is divisible by the sum of its digits

Input:
    One integer (num)

Output:
    Print: Harshad Number or Not Harshad Number

Example:
    Input: 18
    Explanation: 1+8 = 9, 18%9 = 0
    Output: Harshad Number

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdbool.h>

bool Harshad(int iNo)
{
    int iSum = 0;
    int iDigit = 0;
    int iCopy = iNo;

    while(iCopy != 0)
    {
        iDigit = iCopy % 10;
        iSum = iSum + iDigit;
        iCopy = iCopy / 10;
    }

    if((iNo%iSum) == 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}

int main()
{
    int iNum = 0;
    bool bRet = 0;

    printf("Enter a number : \n");
    scanf("%d",&iNum);

    bRet = Harshad(iNum);

    if(bRet == true)
    {
        printf("Harshad Number\n");
    }
    else
    {
        printf("Not a Harshad Number\n");
    }

    return 0;
}