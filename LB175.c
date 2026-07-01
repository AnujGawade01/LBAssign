// LB Assignment 35

/*///////////////////////////////////////////////////////////////////////////////////////

 5. Write a program which checks whether first and last bit is On or OFF. First bit means
 number 1 and last bit means bit number 32.

*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    UINT iAns1 = 0, iAns2 = 0;
    UINT iMask1 = 0x1, iMask2 = 0x80000000;

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
        printf("First and Last bit is ON\n");
    }
    else
    {    
        printf("First and Last bit is OFF\n");
    }

    return 0;
}