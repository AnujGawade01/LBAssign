// LB Assignment 38

/*///////////////////////////////////////////////////////////////////////////////////////

 3. Write a program which accept one number from user and check whether 9th or 12th bit is 
 on or off.

 Write Helper & Entrypoint function separately

*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef unsigned int UINT;

typedef int BOOL;
#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    UINT iMask1 = 0X100, iMask2 = 0X800;

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
    UINT iNum = 0;
    BOOL bRet = FALSE;

    printf("Enter the number : \n");
    scanf("%u",&iNum);


    bRet = ChkBit(iNum);

    if(bRet == TRUE)
    {
        printf("9th or 12th Bit is ON\n");
    }
    else{
        printf("9th or 12th Bit is OFF\n");
    }


    return 0;
}