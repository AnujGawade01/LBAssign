// LB Assignment 30

/*///////////////////////////////////////////////////////////////////////////////////////

 2. Accept character from user. If character is small display its corresponding capital 
 character, and if it is small then display its corresponding capital character. In other 
 cases display as it is.

*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void Display(char ch)
{
    if(ch >= 'a' && ch <= 'z')
    {
        printf("%c\n", ch - 32);
    }
    else if(ch >= 'A' && ch <= 'Z')
    {
        printf("%c\n", ch + 32);
    }
    else
    {
        printf("%c\n", ch);
    }
}

int main()
{
    char cValue = '\0';

    printf("Enter the character : \n");
    scanf("%c",&cValue);

    Display(cValue);

    return 0;
}
