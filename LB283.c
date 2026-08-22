// LB Assignment 58 (54)

/*///////////////////////////////////////////////////////////////////////////////////////

1 . Write a program to check whether a given number is a Strong Number or not.

Description:
    A number is called Strong Number if the sum of factorials of each digit is equal
    to the number itself

Input:
    One integer (num)

Output:
    Print: Strong Number or Not Strong Number

Example:
    Input: 145
    Explanation: 1! + 4! + 5! = 1 + 24 + 120 = 145
    Output: Strong Number

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdbool.h>

bool Strong(int iNo)
{
    int iCopy = iNo;
    int iSum = 0;
    int iDigit = 0;
    int iFact = 1;
    int i = 0;

    while(iNo != 0)
    {
        iFact = 1;
        iDigit = iNo % 10;
        
        for(i = iDigit; i > 0; i--)
        {
            iFact = iFact * i;
        }
        
        iSum = iSum + iFact;

        iNo = iNo/10;
    }

    if(iCopy == iSum)
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

    bRet = Strong(iNum);

    if(bRet == true)
    {
        printf("Strong Number\n");
    }
    else
    {
        printf("Not a Strong Number\n");
    }

    return 0;
}