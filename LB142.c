// LB Assignment 29

/*///////////////////////////////////////////////////////////////////////////////////////

 2. Accept a character from user and check whether it is capital or not (A-Z)
    
*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkCapital(char ch)
{
    if((ch >= 'A' && ch <= 'Z'))
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
    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter the character : \n");
    scanf("%c",&cValue);

    bRet = ChkCapital(cValue);

    if(bRet == TRUE)
    {
        printf("It is a Capital Character\n");
    }
    else
    {
        printf("It is not a Capital Character\n");
    }

    return 0;
}