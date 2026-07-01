// LB Assignment 37

/*///////////////////////////////////////////////////////////////////////////////////////

 5. Write a program which accept one number from user and toggle contents of first and 
 last nibble of the number. Return modified number. (nibble is a group of 4 bits)

 Write Helper & Entrypoint function separately

*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo)
{
    UINT iMask = 0XF000000F;
    UINT iReturn = 0;

    iReturn = iMask ^ iNo;

    return iReturn;
}

int main()
{
    UINT iNo = 0;
    UINT iRet = 0;

    printf("Enter the number : \n");
    scanf("%u",&iNo);

    iRet = ToggleBit(iNo);

    printf("Modified number : %u\n",iRet);

    return 0;
}