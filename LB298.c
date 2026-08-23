// LB Assignment 60 (56)

/*///////////////////////////////////////////////////////////////////////////////////////

5 . Write a program to count frequency of each character

Description:
    Display each character along with its count

Input:
    One string (str)

Output:
    Character -> Count

Example:
    Input: hello
    
    Output: 

    h -> 1
    e -> 1
    l -> 2
    o -> 1

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<string.h>
#include<ctype.h>

void Frequency(char str[])
{
    int i = 0;
    char alpha[26] = {0};
    int index = 0;
    
    for(i = 0; str[i]!= 0; i++)
    {
        str[i] = tolower(str[i]);

        if(str[i] >= 'a' && str[i] <= 'z')
        {
            index = str[i] - 'a';
            alpha[index]++;
        }
    }

    for(i = 0; str[i] != 0; i++)
    {
        if(str[i] >= 'a' && str[i] <= 'z')
        {
            index = str[i] - 'a';

            if(alpha[index] > 0)
            {
                printf("%c -> %d\n",str[i],alpha[index]);
                alpha[index] = 0;

            }
        }
        
    }

}

int main()
{
    char str[100] = "\0";
    
    printf("Enter a string : \n");
    scanf(" %[^\n]s",str);
    
    Frequency(str);

    return 0;
}