// LB Assignment 38

/*///////////////////////////////////////////////////////////////////////////////////////

 5. Write a program which accept one number from user and range of positions from user.
 Toggle all bits from that range.

 Write Helper & Entrypoint function separately

*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef unsigned int UINT;



UINT ToggleBitRange(UINT iNo, UINT iStart, UINT iEnd)
{
    UINT iMask = ((1 << (iEnd - iStart + 1)) - 1) << (iStart - 1);

    return iNo ^ iMask;
}

int main()
{
    UINT iNum = 0, iLocation1 = 0, iLocation2 = 0;
    UINT iRet = 0;
    
    printf("Enter the number : \n");
    scanf("%u",&iNum);

    printf("Enter the start of range : \n");
    scanf("%u",&iLocation1);

    printf("Enter the end of the range : \n");
    scanf("%u",&iLocation2);

    iRet = ToggleBitRange(iNum, iLocation1, iLocation2);

    printf("Updated number is : %u\n",iRet);

    return 0;
}