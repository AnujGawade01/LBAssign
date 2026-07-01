// LB Assignment 37

/*///////////////////////////////////////////////////////////////////////////////////////

 1. Write a program which accept one number & position from user and check whether bit at 
 that position is on or off. If bit is on return TRUE else return FALSE.

 Write Helper & Entrypoint function separately

*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef unsigned int UINT;
typedef int BOOL;
#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo, UINT iPos)
{
    UINT iMask = 0X1;

    iMask = iMask << (iPos - 1);

    if(iMask == (iMask & iNo))
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}

int main()
{
    UINT iNo = 0, iLocation = 0;
    BOOL bRet = FALSE;

    printf("Enter the number : \n");
    scanf("%u",&iNo);

    printf("Enter the position : \n");
    scanf("%d",&iLocation);

    bRet = ChkBit(iNo, iLocation);

    if(bRet == TRUE)
    {
        printf("BIT is ON");;
    }
    else
    {
        printf("BIT is OFF");
    }

    return 0;
}