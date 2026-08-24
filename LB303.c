// LB Assignment 61 (57)

/*///////////////////////////////////////////////////////////////////////////////////////

5 . Write a program to check whether one string is rotation of another.

Description:
    String B is rotation of String A if it can be obtained by shifting characters

Input:
    String 1
    String 2

Output:
    Rotation
    OR
    Not Rotation

Example:
    Input: 
    abcd
    cdab
    
    Output: 
    Rotation

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<string.h>
#include<ctype.h>
#include<stdbool.h>

bool CheckRotation(char str1[],char str2[])
{
    int len1 = strlen(str1);
    int len2 = strlen(str2);

    if(len1 != len2)
    {
        return false;
    }

    char temp[ 2 * len1 + 1];

    strcpy(temp,str1);
    strcat(temp,str1);

    if(strstr(temp,str2) != NULL)
    {
        return true;
    }
 
    return false;
     
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
    
    bRet = CheckRotation(str1,str2);

    if(bRet == true)
    {
        printf("Rotation\n");
    }
    else
    {
        printf("Not a Rotation\n");
    }

    return 0;
}