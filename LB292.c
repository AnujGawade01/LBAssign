// LB Assignment 59 (55)

/*///////////////////////////////////////////////////////////////////////////////////////

4 . Write a program to check whether a given number is a Disarium Number or not.

Description:
    A number is called Disarium Number if
    sum of digits raised to their position (starting from 1) equals the number

Input:
    One integer (num)

Output:
    Print: Disarium Number or Not Disarium Number

Example:
    Input: 135
    Explanation: 1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135
    Output: Disarium Number

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdbool.h>

bool Disarium(int iNo)
{
    int iDigit = 0;
    int iSum = 0;
    int Power = 1;
    int iCopy = iNo;

    while(iCopy != 0)
    {
        Power++;
        iCopy = iCopy / 10;
    }

    iCopy = iNo; // reinitialized with iNo

    while(iCopy != 0)
    {
        iDigit = iCopy % 10;

        int TempPower = 1;

        for(int i = 1; i < Power; i++)
        {
            TempPower = TempPower * iDigit;
        }

        iSum = iSum + TempPower;
        
        Power--;
        iCopy = iCopy / 10;
    }

    if(iSum == iNo)
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

    bRet = Disarium(iNum);

    if(bRet == true)
    {
        printf("Disarium Number\n");
    }
    else
    {
        printf("Not a Disarium Number\n");
    }

    return 0;
}