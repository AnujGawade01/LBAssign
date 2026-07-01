// LB Assignment 38

/*///////////////////////////////////////////////////////////////////////////////////////

 4. Write a program which accept one number, two positions from user and check whether bit
 at first or bit at second position is ON or OFF.

 Write Helper & Entrypoint function separately

*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef unsigned int UINT;

typedef int BOOL;
#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo, UINT iPos1, UINT iPos2)
{
    UINT iMask1 = 0X1, iMask2 = 0X1;

    iMask1 = iMask1 << (iPos1 - 1);

    iMask2 = iMask2 << (iPos2 - 1);

    if(((iNo & iMask1) != 0) || ((iNo & iMask2) != 0))
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
    UINT iNum = 0, iLocation1 = 0, iLocation2 = 0;
    BOOL bRet = FALSE;

    printf("Enter the number : \n");
    scanf("%u",&iNum);

    printf("Enter the first position : \n");
    scanf("%u",&iLocation1);

    printf("Enter the second position : \n");
    scanf("%u",&iLocation2);

    bRet = ChkBit(iNum, iLocation1, iLocation2);

    if(bRet == TRUE)
    {
        printf("Bit is ON\n");
    }
    else{
        printf("Bit is OFF\n");
    }

    return 0;
}