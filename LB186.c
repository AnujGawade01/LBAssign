// LB Assignment 38

/*///////////////////////////////////////////////////////////////////////////////////////

 1. Write a program which accept one number from user and count number of ON (1) bits in it
 without using % and / operator 

 Write Helper & Entrypoint function separately

*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef unsigned int UINT;

UINT CountOne(UINT iNo)
{
    UINT iCount = 0;

    while(iNo != 0)
    {
        if((iNo & 1) == 1)
        {
            iCount++;
        }
        iNo = iNo >> 1;
    }

    return iCount;
}

int main()
{
    UINT iNo = 0;
    UINT iRet = 0;

    printf("Enter the number : \n");
    scanf("%u",&iNo);

    iRet = CountOne(iNo);

    printf("No of 1's are : %d\n",iRet);

    return 0;
}