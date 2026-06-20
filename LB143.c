// LB Assignment 29

/*///////////////////////////////////////////////////////////////////////////////////////

 3. Accept a character from user and check whether it is digit or not (0-9)
    
*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkDigit(char ch)
{
    if((ch >= 48 && ch <= 57))
    {
        return TRUE;
    }
    else 
    {
        return FALSE;
    }

/*  Can also work

    if((ch >= '0' && ch <= '9'))
    {
        return TRUE;
    }
    else 
    {
        return FALSE;
    }    
        
*/

}

int main()
{
    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter the character : \n");
    scanf("%c",&cValue);

    bRet = ChkDigit(cValue);

    if(bRet == TRUE)
    {
        printf("It is a Digit\n");
    }
    else
    {
        printf("It is not a Digit\n");
    }

    return 0;
}