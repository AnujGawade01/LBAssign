// LB Assignment 58 (54)

/*///////////////////////////////////////////////////////////////////////////////////////

3 . Write a program to check whether a given number is a Perfect Number or not.

Description:
    A number is called Perfect Number if the sum of all proper divisors(excluding the number)
    is equal to the number

Input:
    One integer (num)

Output:
    Print: Perfect Number or Not Perfect Number

Example:
    Input: 28
    Explanation: divisiors = 1,2,4,7,14 -> sum = 28
    Output: Perfect Number

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdbool.h>

bool Perfect(int iNo)
{
    int i = 0;
    int iSum = 0;

    for(i = 1; i < iNo; i++)
    {
        if((iNo % i) == 0)
        {
            iSum = iSum + i;
        }
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

    bRet = Perfect(iNum);

    if(bRet == true)
    {
        printf("Perfect Number\n");
    }
    else
    {
        printf("Not a Perfect Number\n");
    }

    return 0;
}