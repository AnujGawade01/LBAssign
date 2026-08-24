// LB Assignment 61 (57)

/*///////////////////////////////////////////////////////////////////////////////////////

2 . Write a program to find longest word in a sentence

Description:
    Identify the word having maximum length

Input:
    One sentence

Output:
    Longest word

Example:
    Input: 
    Marvellous Infosystems Pune
    
    Output: 
    Infosystems

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<string.h>

char* FindLongest(char str[])
{
    int len = strlen(str);
    int current_start = 0;
    int max_len = 0;
    int longest_start = 0;
    int i = 0;

    for(i = 0; i <= len; i++)
    {
        if(str[i] == ' ' || str[i] == '\0')
        {
            int current_len = i - current_start;

            if(current_len > max_len)
            {
                max_len = current_len;
                longest_start = current_start;
            }

            current_start = i + 1;
        }
    }

    static char ret[100] = "\0";
    
    for(i = 0; i < max_len; i++)
    {
        ret[i] = str[longest_start + i];
    }

    ret[max_len] = '\0';

    return ret;
}

int main()
{
    char str[100] = "\0";
    char* iRet;
    
    printf("Enter a string : \n");
    scanf(" %[^\n]s",str);
    
    iRet = FindLongest(str);

    printf("%s\n",iRet);

    return 0;
}