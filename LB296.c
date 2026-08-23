// LB Assignment 60 (56)

/*///////////////////////////////////////////////////////////////////////////////////////

3 . Write a program to check whether a given string is a Pangram.

Description:
    A string is called pangram if it contains all alphabets from 'a' to 'z' at least once

Input:
    One sentence (str)

Output:
    Print: Pangram or Not Pangram

Example:
    Input: the quick brown fox jumps over the lazy dog
    
    Output: Pangram

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdbool.h>
#include<string.h>
#include<ctype.h>

bool Pangram(char str[])
{
    int i = 0;
    char alpha[26] = {0};
    
    for(i = 0; str[i] != 0; i++)
    {
        str[i] = tolower(str[i]);
    

        if(str[i] >= 'a' && str[i] <= 'z')
        {
            int index = str[i] - 'a';
            alpha[index] = 1;
        }
    }

    for(i = 0; i < 26; i++)
    {
        if(alpha[i] == 0)
        {
            return false;
        }
    }

    return true;
}

int main()
{
    char str[100] = "\0";
    bool bRet = false;
    
    printf("Enter a string : \n");
    scanf(" %[^\n]s",str);
    
    bRet = Pangram(str);

    if(bRet == true)
    {
        printf("Pangram string\n");
    }
    else
    {
        printf("Not Pangram string\n");
    }

    return 0;
}