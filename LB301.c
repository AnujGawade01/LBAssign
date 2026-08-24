// LB Assignment 61 (57)

/*///////////////////////////////////////////////////////////////////////////////////////

3 . Write a program to remove duplicate charactes from a string

Description:
    Remove repeated characters while keeping first occurence

Input:
    One string

Output:
    String without duplicate characters

Example:
    Input: 
    banana
    
    Output: 
    ban

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<string.h>
#include<ctype.h>

char* RemoveDupe(char str[])
{
    int i = 0;
    char alpha[26] = {0};
    int write_index = 0;
    int index = 0;

    for(i = 0; str[i]!= 0; i++)
    {
        str[i] = tolower(str[i]);

        if(str[i] >= 'a' && str[i] <= 'z')
        {
            index = str[i] - 'a';

            if(alpha[index] == 0)
            {
                alpha[index] = 1;
                str[write_index] = str[i];
                write_index++;
            }
        }
        else
        {
            str[write_index] = str[i];
            write_index++; 
        } 
    }

    str[write_index] = '\0';    

    return str;
}

int main()
{
    char str[100] = "\0";
    char* iRet;
    
    printf("Enter a string : \n");
    scanf(" %[^\n]s",str);
    
    iRet = RemoveDupe(str);

    printf("%s\n",iRet);

    printf("%s\n",str);

    return 0;
}