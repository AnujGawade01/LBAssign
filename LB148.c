// LB Assignment 30

/*///////////////////////////////////////////////////////////////////////////////////////

 3. Accept character from user. If it is capital then display all the characters from the 
 input characters till Z. If input character is small then print all the characters in 
 reverse order till a. In other cases return directly

*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void Display(char ch)
{
    char chCnt = '\0';

    printf("\n");

    if(ch >= 'A' && ch <= 'Z')
    {
        for(chCnt = ch; chCnt <= 'Z'; chCnt++)
        {
            printf("%c\n", chCnt);
        }
    }
    else if(ch >= 'a' && ch <= 'z')
    {
        for(chCnt = ch; chCnt >= 'a'; chCnt--)
        {
            printf("%c\n",chCnt);
        }
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