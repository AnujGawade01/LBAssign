// LB Assignment 31

/*///////////////////////////////////////////////////////////////////////////////////////

 3. Write a program which accept string from user and return difference between frequency of
 small characters and frequency of capital characters

*////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int Difference(char *str)
{
    int iCntCap = 0, iCntSmall = 0, iDiff = 0;

    while(*str != '\0')
    {
        if(*str >= 'A' && *str <= 'Z')
        {
            iCntCap++;
        }

        if(*str >= 'a' && *str <= 'z')
        {
            iCntSmall++;
        }
        str++;
    }

    iDiff = iCntSmall - iCntCap;

    return iDiff;
}

int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter string : \n");
    scanf("%[^\n]s",arr);

    iRet = Difference(arr);

    printf("Difference is : %d",iRet);

    return 0;
}