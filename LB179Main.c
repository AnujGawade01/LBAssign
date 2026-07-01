// LB Assignment 36

/*///////////////////////////////////////////////////////////////////////////////////////

 4. Write a program which accept one number from user and toggle 7th & 10th bit of that 
 number. Return modified number.

 Write Helper & Entrypoint function separately

*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo);

int main()
{
    UINT iNo = 0;
    UINT iRet = 0;

    printf("Enter the number : \n");
    scanf("%u",&iNo);

    iRet = ToggleBit(iNo);

    printf("Updated number : %u\n",iRet);

    return 0;
}