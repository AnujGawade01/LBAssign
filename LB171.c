// LB Assignment 35

/*///////////////////////////////////////////////////////////////////////////////////////

 1. Write a program which checks whether 15th bit is On or Off

*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    UINT iAns = 0;
    UINT iMask = 0x4000;

    iAns = iNo & iMask;

    if(iAns == iMask)
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
    UINT iNo = 0;
    BOOL bRet = FALSE;

    printf("Enter the number : \n");
    scanf("%u",&iNo);

    bRet = ChkBit(iNo);

    if(bRet == TRUE)
    {
        printf("15th bit is ON\n");
    }
    else
    {    
        printf("15th bit is OFF\n");
    }

    return 0;
}