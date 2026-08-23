// LB Assignment 60 (56)

/*///////////////////////////////////////////////////////////////////////////////////////

2 . Write a program to check whether two strings are Anagrams.

Description:
    Two string are Anagrams if they contain the same characters with the same frequency
    regardless of order

Input:
    First string (str1)
    Second string (str2)

Output:
    Print: Anagram or Not Anagram

Example:
    Input: listen
           silent
    
    Output: Anagram

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdbool.h>
#include<string.h>

bool Anagram(char str1[], char str2[])
{
    if(strlen(str1) != strlen(str2))
    {
        return false;
    }

    int count[256] = {0};
    int i = 0;

    for(i = 0; str1[i] != 0; i++)
    {
        count[str1[i]]++;
        count[str2[i]]--;
    }

    for(i = 0; i < 256; i++)
    {
        if(count[i] != 0)
        {
            return false;
        }
    }
    return true;
}

int main()
{
    char str1[100] = "\0";
    char str2[100] = "\0";
    bool bRet = false;
    
    printf("Enter first string : \n");
    scanf(" %[^\n]s",str1);
    printf("Enter second string : \n");
    scanf(" %[^\n]s",str2);
    
    bRet = Anagram(str1, str2);

    if(bRet == true)
    {
        printf("Anagram string\n");
    }
    else
    {
        printf("Not Anagram string\n");
    }

    return 0;
}