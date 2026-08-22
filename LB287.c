// LB Assignment 58 (54)

/*///////////////////////////////////////////////////////////////////////////////////////

5 . Write a program to check whether a given number is a Palindrome Number or not.

Description:
    A description is called Palindrome Number if it remains the same when reversed

Input:
    One integer (num)

Output:
    Print: Palindrome Number or Not Palindrome Number

Example:
    Input: 121
    Reverse: 121
    Output: Palindrome Number

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdbool.h>

bool Palindrome(int iNo)
{
    int iRev = 0;
    int iDigit = 0;
    int iCopy = iNo;
    

    while(iCopy != 0)
    {
        iDigit = iCopy % 10;

        iRev = iRev * 10 + iDigit;

        iCopy = iCopy / 10;
    }

    if(iNo == iRev)
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

    bRet = Palindrome(iNum);

    if(bRet == true)
    {
        printf("Palindrome Number\n");
    }
    else
    {
        printf("Not a Palindrome Number\n");
    }

    return 0;
}