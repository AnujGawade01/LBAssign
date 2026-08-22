// LB Assignment 59 (55)

/*///////////////////////////////////////////////////////////////////////////////////////

3.1 . Write a program to check whether a given number is a Spy Number or not.

Description:
    A number is called Spy Number if
    Sum of digits = product of digits

Input:
    One integer (num)

Output:
    Print: Spy Number or Not Spy Number

Example:
    Input: 1124
    Sum = 1+1+2+4 = 8
    Product = 1*1*2*4 = 8
    Output: Spy Number

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdbool.h>

bool Spy(int iNo)
{
    int iSum = 0;
    int iDigit = 0;
    int iProduct = 1;
    
    while(iNo != 0)
    {
        iDigit = iNo % 10;

        iSum = iSum + iDigit;
        iProduct = iProduct * iDigit;

        iNo = iNo / 10;
    }

    if(iProduct == iSum)
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

    bRet = Spy(iNum);

    if(bRet == true)
    {
        printf("Spy Number\n");
    }
    else
    {
        printf("Not a Spy Number\n");
    }

    return 0;
}