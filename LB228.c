// LB Assignment 46

/*///////////////////////////////////////////////////////////////////////////////////////

 3. Write a recursive program which accept string from user and count number of small characters
 Input : HElloWorLD
 Output : 5

/*///////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int Small(char * str)
{
    static int Count = 0;

    if(*str != '\0')
    {
        if(*str >= 'a' && *str <= 'z')
        {
            Count++;
        }
        *str++;
        Small(str);
    }

    return Count;
}

int main()
{
    int iRet = 0;
    char arr[50];

    printf("Enter string : \n");
    scanf("%[^\n]s",arr);

    iRet = Small(arr);

    printf("%d",iRet);

    return 0;
}