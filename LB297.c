// LB Assignment 60 (56)

/*///////////////////////////////////////////////////////////////////////////////////////

4 . Write a program to print duplicate characters from a string

Description:
    Find and display characters that appear more than once

Input:
    One string (str)

Output:
    Duplicate characters printed in one line

Example:
    Input: programming
    
    Output: r g m

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<string.h>
#include<ctype.h>

void PrintDupe(char str[])
{
    int i = 0;
    char * copy = str;
    char alpha[26] = {0};
    int index = 0;
    
    for(i = 0; str[i] != 0; i++)
    {
        str[i] = tolower(str[i]);

        if(str[i] >= 'a' && str[i] <= 'z')
        {
            index = str[i] - 'a';
            alpha[index]++;

            if(alpha[index] > 1)
            {
                printf("%c\t",(index + 'a'));
            }
        }
    }

}

int main()
{
    char str[100] = "\0";
    
    printf("Enter a string : \n");
    scanf(" %[^\n]s",str);
    
    PrintDupe(str);

    return 0;
}