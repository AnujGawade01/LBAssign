// LB Assignment 48

/*///////////////////////////////////////////////////////////////////////////////////////

 1. Write application which accepts file name from user and open that file in read mode
 Input : Demo.txt   
 Output : File opened successfully
 

/*///////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<fcntl.h>
#include<io.h>
#include<stdlib.h>

void FileOpen(char FName[]) 
{
    int fd = 0;
    
    fd = open(FName, O_RDONLY); 
    
    if (fd == -1) 
    {
        printf("Unable to open file\n");
        return;
    }
    else
    {
        printf("File opened successfully");
    }

    printf("\n");
    
    close(fd);
}

int main()
{
    char FileName[30];

    printf("Enter file name : \n");
    scanf("%s",FileName);

    FileOpen(FileName);

    return 0;
}