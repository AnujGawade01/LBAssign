// LB Assignment 47

/*///////////////////////////////////////////////////////////////////////////////////////

 4. Write a program which accepts file name & one character from user and count number of 
 occurences of that characters from that filefrom that file
 Input : Demo.txt   'M'
 Output : Frequency of M

/*///////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<fcntl.h>
#include<io.h>
#include<stdlib.h>

int CountChar(char FName[], char Ch)
{
    int fd = 0, iCount = 0, iRet = 0;
    char Buffer[1024];

    fd = open(FName,O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file\n");
    }
    
    
        while((iRet = read(fd,Buffer,sizeof(Buffer))) > 0)
        {
            for (int i = 0; i < iRet; i++) 
            {
                if (Buffer[i] == Ch) 
                {
                    iCount++;
                }
            }
        }
    
    
    close(fd);

    return iCount;
}

int main()
{
    char FileName[30];
    int iRet = 0;
    char cValue;

    printf("Enter file name : \n");
    scanf("%s",FileName);

    printf("Enter the character : \n");
    scanf(" %c",&cValue);

    iRet = CountChar(FileName,cValue);

    printf("Frequency is : %d\n",iRet);

    return 0;
}