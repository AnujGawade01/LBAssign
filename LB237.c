// LB Assignment 48

/*///////////////////////////////////////////////////////////////////////////////////////

 2. Write application which accepts file name from user and create that file
 Input : Demo.txt   
 Output : File created successfully
 

/*///////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<fcntl.h>

void FileCreate(char FName[]) 
{
    int fd = 0;
    
    fd = creat(FName,0777); 
    
    if (fd == -1) 
    {
        printf("Unable to create file\n");
        return;
    }
    else
    {
        printf("File created successfully");
    }

    printf("\n");
}

int main()
{
    char FileName[30];

    printf("Enter file name : \n");
    scanf("%s",FileName);

    FileCreate(FileName);

    return 0;
}