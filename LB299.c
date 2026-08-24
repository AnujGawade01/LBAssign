// LB Assignment 61 (57)

/*///////////////////////////////////////////////////////////////////////////////////////

1 . Write a program to reverse each word of a sentence

Description:
    Reverse individual words but keep word order same

Input:
    One sentence

Output:
    Sentence with reversed words

Example:
    Input: 
    Java is powerful
    
    Output: 
    avaJ si lufrewop

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<string.h>
#include<ctype.h>

char* Reverse(char str[])
{
    int i = 0, start = 0, end = 0;
    int len = strlen(str);
    char temp = '\0';

    while(i <= len)
    {
        if(str[i] == ' ' || str[i] == '\0')
        {
            end = i - 1;

            while(start < end)
            {
                temp = str[start];
                str[start] = str[end];
                str[end] = temp;
                start++;
                end--;
            }

            start = i + 1;
        }

        i++;
    }
    
    
    return str;
}

int main()
{
    char str[100] = "\0";
    char* iRet;
    
    printf("Enter a string : \n");
    scanf(" %[^\n]s",str);
    
    iRet = Reverse(str);

    printf("%s\n",iRet);

    return 0;
}