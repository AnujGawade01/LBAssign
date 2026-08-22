// LB Assignment 59 (55)

/*///////////////////////////////////////////////////////////////////////////////////////

3.2 . Write a program to check whether a given number is a Sunny Number or not.

Description:
    A number is called Sunny Number if
    num + 1 is a perfect square

Input:
    One integer (num)

Output:
    Print: Sunny Number or Not Sunny Number

Example:
    Input: 8
    Explanation: 8+1 = 9, 9 is a perfect square
    Output: Sunny Number

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdbool.h>

bool Sunny(int iNo)
{

    int iNew = 0;
    int i = 1;

    iNew = iNo + 1;

    if(iNew == 0)   // 0 is also a perfect number
    {
        return true;
    }

    while((i * i) <= iNew)
    {
        if((i * i) == iNew)
        {
            return true;
        }
        i++;
    }
    

    return false;
}

int main()
{
    int iNum = 0;
    bool bRet = 0;

    printf("Enter a number : \n");
    scanf("%d",&iNum);

    bRet = Sunny(iNum);

    if(bRet == true)
    {
        printf("Sunny Number\n");
    }
    else
    {
        printf("Not a Sunny Number\n");
    }

    return 0;
}