// LB Assignment 59 (55)

/*///////////////////////////////////////////////////////////////////////////////////////

1 . Write a program to check whether a given number is a Neon Number or not.

Description:
    A number is called Neon Number if the sum of digits of its square equals the number

Input:
    One integer (num)

Output:
    Print: Neon Number or Not Neon Number

Example:
    Input: 9
    Explanation: 9^2 = 81, sum of digits = 8+1 = 9;
    Output: Neon Number

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdbool.h>

bool Neon(int iNo)
{
    int iSqr = 0;
    int iDigit = 0;
    int iSum = 0;
    
    iSqr = iNo * iNo;

    while(iSqr != 0)
    {
        iDigit = iSqr % 10;
        iSum = iSum + iDigit;
        iSqr = iSqr/10;
    }

    if(iNo == iSum)
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

    bRet = Neon(iNum);

    if(bRet == true)
    {
        printf("Neon Number\n");
    }
    else
    {
        printf("Not a Neon Number\n");
    }

    return 0;
}