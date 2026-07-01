// LB Assignment 38

/*///////////////////////////////////////////////////////////////////////////////////////

 2. Write a program which accept two numbers from user and display position of common ON 
 bits from that two numbers

 Write Helper & Entrypoint function separately

*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef unsigned int UINT;

UINT CommonBits(UINT iNo1, UINT iNo2)
{
    UINT iResult = iNo1 & iNo2;
    UINT iMask = 0x1;
    UINT iPos = 1;



    while((iResult >= iMask) && (iPos <= 32))
    {
        if((iResult & iMask) != 0)
        {
            printf("%d ", iPos);
        }
        
        iMask = iMask << 1;     // Move mask to the next bit
        iPos++;                 // Increment position
    }
    printf("\n");
}

int main()
{
    UINT iNum1 = 0,iNum2 = 0;

    printf("Enter the first number : \n");
    scanf("%u",&iNum1);

    printf("Enter the second number : \n");
    scanf("%u",&iNum2);

    CommonBits(iNum1,iNum2);

    return 0;
}