// LB Assignment 35

/*///////////////////////////////////////////////////////////////////////////////////////

 4. Write a program which checks whether 7th & 8th & 9th bit is On or Off

*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    UINT iAns1 = 0, iAns2 = 0, iAns3 = 0;
    UINT iMask1 = 0x40, iMask2 = 0x80, iMask3 = 0x100;

    iAns1 = iNo & iMask1;
    iAns2 = iNo & iMask2;
    iAns3 = iNo & iMask3;

    if((iAns1 == iMask1) && (iAns2 == iMask2) && (iAns3 == iMask3))
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
        printf("7th & 8th & 9th bit is ON\n");
    }
    else
    {    
        printf("7th & 8th & 9th bit is OFF\n");
    }

    return 0;
}