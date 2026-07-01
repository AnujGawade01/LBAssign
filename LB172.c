// LB Assignment 35

/*///////////////////////////////////////////////////////////////////////////////////////

 2. Write a program which checks whether 5th & 18th bit is On or Off

*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    UINT iAns1 = 0, iAns2 = 0;
    UINT iMask1 = 0x10, iMask2 = 0x20000;


    iAns1 = iNo & iMask1;
    iAns2 = iNo & iMask2;

    if((iAns1 == iMask1) && (iAns2 == iMask2))
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
        printf("5th & 18th bit is ON\n");
    }
    else
    {    
        printf("5th & 18th bit is OFF\n");
    }

    return 0;
}