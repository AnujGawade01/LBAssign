// LB Assignment 61 (57)

/*///////////////////////////////////////////////////////////////////////////////////////

4 . Write a program to count vowels and consonants in a string.

Description:
    Count total vowels and consonants separately

Input:
    One string

Output:
    Vowels: <count>
    Consonants: <count>

Example:
    Input: 
    education
    
    Output: 
    Vowels: 5
    Consonants: 4

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<string.h>
#include<ctype.h>

int * VowelConsonants(char str[])
{
    int i = 0;
    static int ret[2];
    int vowel = 0;
    int cons = 0;

    for(i = 0; str[i]!= 0; i++)
    {
        str[i] = tolower(str[i]);

        if(str[i] >= 'a' && str[i] <= 'z')
        {
            if(str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u')
            {
                vowel++;
            }
            else
            {
                cons++;
            }
        }
    }
 
    ret[0] = vowel;
    ret[1] = cons;

    return ret;
}

int main()
{
    char str[100] = "\0";
    int * iRet = NULL;
    
    printf("Enter a string : \n");
    scanf(" %[^\n]s",str);
    
    iRet = VowelConsonants(str);

    printf("Vowels: %d\n",iRet[0]);

    printf("Consonants: %d\n",iRet[1]);

    return 0;
}