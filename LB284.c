// LB Assignment 58 (54)

/*///////////////////////////////////////////////////////////////////////////////////////

2 . Write a program to check whether a given number is a Armstrong Number or not.

Description:
    A number is called Armstrong Number if:
    (sum of each digit raised to power of total digit) = number
    to the number itself

Input:
    One integer (num)

Output:
    Print: Armstrong Number or Not Armstrong Number

Example:
    Input: 153
    Explanation: 1^3 + 5^3 + 3^3 = 153
    Output: Armstrong Number

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdbool.h>

bool Armstrong(int iNo)
{
    int iCopy = iNo;
    int iCount = 0;
    int i = 0;
    int iDigit = 0;
    int iMult = 1;
    int iSum = 0;

    while(iCopy != 0)
    {
        iCount++;
        iCopy = iCopy / 10;
    }

    iCopy = iNo;

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        iMult = 1;

        for(i = 1; i <= iCount; i++)
        {
            iMult = iMult * iDigit;
        }

        iSum = iSum + iMult;

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

    bRet = Armstrong(iNum);

    if(bRet == true)
    {
        printf("Armstrong Number\n");
    }
    else
    {
        printf("Not a Armstrong Number\n");
    }

    return 0;
}