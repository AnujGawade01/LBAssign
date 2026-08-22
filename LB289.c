// LB Assignment 59 (55)

/*///////////////////////////////////////////////////////////////////////////////////////

2 . Write a program to check whether a given number is a Automorphic Number or not.

Description:
    A number is called Automorphic Number if its square ends with the same digits as
    the number

Input:
    One integer (num)

Output:
    Print: Automorphic Number or Not Automorphic Number

Example:
    Input: 25
    Explanation: 25^2 = 625, ends with 25
    Output: Automorphic Number

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdbool.h>

bool Automorphic(int iNo)
{
    int iSqr = 0;
    int iDigit = 0;
    int iSum = 0;
    
    iSqr = iNo * iNo;

    while(iNo != 0)
    {
        if(iNo % 10 != iSqr % 10)
        {
            return false;
        }

        iNo = iNo / 10;
        iSqr = iSqr / 10;
    }

    return true;
    
}

int main()
{
    int iNum = 0;
    bool bRet = 0;

    printf("Enter a number : \n");
    scanf("%d",&iNum);

    bRet = Automorphic(iNum);

    if(bRet == true)
    {
        printf("Automorphic Number\n");
    }
    else
    {
        printf("Not a Automorphic Number\n");
    }

    return 0;
}