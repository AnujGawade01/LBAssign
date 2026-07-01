// LB Assignment 37

/*///////////////////////////////////////////////////////////////////////////////////////

 4. Write a program which accept one number & position from user and toggle that bit. 
 Return modified number.

 Write Helper & Entrypoint function separately

*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo, UINT iPos)
{
    UINT iMask = 0X1;
    UINT iReturn = 0;

    iMask = iMask << (iPos - 1);

    iReturn = iMask ^ iNo;

    return iReturn;
}

int main()
{
    UINT iNo = 0, iLocation = 0;
    UINT iRet = 0;

    printf("Enter the number : \n");
    scanf("%u",&iNo);

    printf("Enter the position : \n");
    scanf("%d",&iLocation);

    iRet = ToggleBit(iNo, iLocation);

    printf("Modified number : %u\n",iRet);

    return 0;
}