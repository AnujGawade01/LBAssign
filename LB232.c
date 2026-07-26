// LB Assignment 47

/*///////////////////////////////////////////////////////////////////////////////////////

 2. Write a program which accepts file name from user and count number of small characters
 from that file
 Input : Demo.txt
 Output : Number of Capital characters

/*///////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<fcntl.h>
#include<io.h>
#include<stdlib.h>

int CountCapital(char FName[])
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
                if (Buffer[i] >= 'a' && Buffer[i] <= 'z') 
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

    printf("Enter file name : \n");
    scanf("%s",FileName);

    iRet = CountCapital(FileName);

    printf("Number of small characters are %d\n",iRet);

    return 0;
}