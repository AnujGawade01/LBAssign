// LB Assignment 31

/*///////////////////////////////////////////////////////////////////////////////////////

 5. Write a program which accept string from user and display it in reverse order

*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void Reverse(char *str)
{
    int iLength = 0, iCnt = 0;
    char *start = str;

    while(*str != '\0')
    {
        iLength++;
        str++;
    }

    printf("Reverse string is : \n");
    
    for(iCnt = iLength - 1; iCnt >= 0; iCnt--)
    {
        printf("%c",start[iCnt]);
    }
    
}

int main()
{
    char arr[20];

    printf("Enter string : \n");
    scanf("%[^\n]s",arr);

    Reverse(arr);

    return 0;
}