// LB Assignment 30

/*///////////////////////////////////////////////////////////////////////////////////////

 4. Accept character from user and check whether it is special symbol or not
 (!, @, #, $, %, ^, &, *)

*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkSpecial(char ch)
{
    if( ch == '!' || ch == '@' || ch == '#' || ch == '$' || 
        ch == '%' || ch == '^' || ch == '&' || ch == '*') 
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

    bRet = ChkSpecial(cValue);

    if(bRet == TRUE)
    {
        printf("It is a Special Character\n");
    }
    else
    {
        printf("It is not a Special Character\n");
    }

    return 0;
}