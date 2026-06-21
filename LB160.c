// LB Assignment 32

/*///////////////////////////////////////////////////////////////////////////////////////

 5. Write a program which accept string from user and count number of white spaces

*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int CountWhite(char *str)
{
    int iCnt = 0;

    while(*str != '\0')
    {
        if(*str == ' ')
        {
            iCnt++;
        }
        str++;
    }

    return iCnt;
}

int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter string : \n");
    scanf("%[^\n]s",arr);

    iRet = CountWhite(arr);

    printf("Frequency of whitespaces is : %d", iRet);

    return 0;
}