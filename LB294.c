// LB Assignment 60 (56)

/*///////////////////////////////////////////////////////////////////////////////////////

1 . Write a program to check whether a given string is a Palindrome.

Description:
    A string is called palindrome if it reads the same forward and backward

Input:
    One string (str)

Output:
    Print: Palindrome String or Not Palindrome String

Example:
    Input: madam
    
    Output: Palindrome String

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdbool.h>
#include<string.h>

bool Palindrome(char str[])
{
    int start = 0;
    int end = strlen(str) - 1;

    while(start < end)
    {
        if(str[start] != str[end])
        {
            return false;
        }

        start++;
        end--;
    }

    return true;
}

int main()
{
    char str[100] = "\0";
    bool bRet = false;
    
    printf("Enter a string : \n");
    scanf(" %[^\n]s",str);
    
    bRet = Palindrome(str);

    if(bRet == true)
    {
        printf("Palindrome string\n");
    }
    else
    {
        printf("Not Palindrome string\n");
    }

    return 0;
}