// LB Assignment 30

/*///////////////////////////////////////////////////////////////////////////////////////

 1. Write a program which displays ASCII table. Table contains symbol, Decimal, 
 Hexadecimal and Octal representation of every member from 0 to 255
    
*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void DisplayASCII()
{
    int iCnt = 0;
    
    printf("%-10s | %-10s | %-12s | %-10s\n", "Symbol", "Decimal", "Hexadecimal", "Octal");
    printf("-------------------------------------------------------------\n");
    
    for(iCnt = 0; iCnt <= 255; iCnt++)
    {
        if(iCnt >= 0 && iCnt <= 32)
        {
            printf("%-10s | %-10d | %-12X | %-10o\n", "Control", iCnt, iCnt, iCnt);
        }
        else if(iCnt == 127)
        {
            printf("%-10s | %-10d | %-12X | %-10o\n", "DEL", iCnt, iCnt, iCnt);
        }
        else
        {
            printf("%-10c | %-10d | %-12X | %-10o\n", iCnt, iCnt, iCnt, iCnt);
        }
    }
}

int main()
{
    DisplayASCII();

    return 0;
}