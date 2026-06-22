// LB Assignment 34

/*///////////////////////////////////////////////////////////////////////////////////////

 5. Write a program which accepts 2 strings from user and concat second string after first 
 string. (Implement strcat() function).

*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void StrCatX(char *first, char *sec)        
{
    while(*first != '\0')
    {
        first++;
    }

    while(*sec != '\0')
    {
        *first = *sec;
        first++;
        sec++;
    }

    *first = '\0';
}

int main()
{
    char arr[50] = "Marvellous Infosystems";
    char brr[30] = " Logic Building";

    StrCatX(arr,brr);

    printf("%s",arr);       // Marvellous Infosystems Logic Building

    return 0;
}