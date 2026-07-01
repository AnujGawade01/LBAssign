// LB Assignment 35

/*///////////////////////////////////////////////////////////////////////////////////////

 3. Write a program which checks whether 7th & 15th & 21st, 28th bit is On or Off

*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    UINT iAns1 = 0, iAns2 = 0, iAns3 = 0, iAns4 = 0;

    UINT iMask1 = 0x40;
    UINT iMask2 = 0x4000;
    UINT iMask3 = 0x100000;
    UINT iMask4 = 0x8000000;

    iAns1 = iNo & iMask1;   
    iAns2 = iNo & iMask2;
    iAns3 = iNo & iMask3;
    iAns4 = iNo & iMask4;

    if((iAns1 == iMask1) && (iAns2 == iMask2) && (iAns3 == iMask3) && (iAns4 == iMask4))
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
        printf("7th , 15th, 21st & 28th bit is ON\n");
    }
    else
    {       
        printf("7th , 15th, 21st & 28th bit is OFF\n");
    }

    return 0;
}