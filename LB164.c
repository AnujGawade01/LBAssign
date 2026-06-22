// LB Assignment 33

/*///////////////////////////////////////////////////////////////////////////////////////

 4. Write a program which accept string from user and accept one character. Return index
 of last occurrence of that character.

*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int LastChar(char *str, char ch)        
{
    int iCnt = 0, iPos = -1;

    while(*str != '\0')
    {
        if(*str == ch) 
        {
            iPos = iCnt;
        }
        iCnt++;
        str++;
    }

    return iPos;
}

int main()
{
    char arr[20];
    char cValue = '\0';
    int iRet = 0;

    printf("Enter string : \n");
    scanf("%[^\n]s",arr);

    printf("Enter the character : \n");
    scanf(" %c",&cValue);

    iRet = LastChar(arr,cValue);

    printf("Character location is : %d",iRet);

    return 0;
}