// LB Assignment 59 (55)

/*///////////////////////////////////////////////////////////////////////////////////////

5 . Write a program to check whether a given number is a Trimorphic Number or not.

Description:
    A number is called Trimorphic Number if its cube ends with the number itself

Input:
    One integer (num)

Output:
    Print: Trimorphic Number or Not Trimorphic Number

Example:
    Input: 4
    Explanation: 4^3 = 64 -> ends with 4
    Output: Trimorphic Number

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdbool.h>

bool Trimorphic(int iNo)
{
    int iDigit = 0;
    int iSum = 0;
    int iNoCube = 1;

    iNoCube = iNo * iNo * iNo;

    while(iNo != 0)
    {
        if(iNo % 10 != iNoCube % 10)
        {
            return false;
        }

        iNo = iNo / 10;
        iNoCube = iNoCube / 10;
    }

    return true;
}

int main()
{
    int iNum = 0;
    bool bRet = 0;

    printf("Enter a number : \n");
    scanf("%d",&iNum);

    bRet = Trimorphic(iNum);

    if(bRet == true)
    {
        printf("Trimorphic Number\n");
    }
    else
    {
        printf("Not a Trimorphic Number\n");
    }

    return 0;
}