// LB Assignment 48

/*///////////////////////////////////////////////////////////////////////////////////////

 5. Write application which accepts file name from user and one string from user. Write that
 string at the end of file

 Input : Demo.txt   
         Hello World        

 Output : Write "Hello World" at the end of Demo.txt file
 
/*///////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<fcntl.h>
#include<string.h>

int AppendString(char FName[], char String[])  
{
    int fd = 0;
    
    fd = open(FName, O_WRONLY | O_CREAT | O_APPEND, 0777); 
    
    if (fd == -1) 
    {
        printf("Unable to create or open file\n");
        return -1;
    }

    int ret = write(fd, String, strlen(String));

    close(fd);

    return ret;
}

int main()
{
    char FileName[30];
    int iRet = 0;
    char Str[20];

    printf("Enter file name : \n");
    scanf(" %[^\n]s",FileName);

    printf("Enter the string : \n");
    scanf(" %[^\n]s",Str);

    iRet = AppendString(FileName, Str);

    printf("Successfully wrote %d bytes at the end of %s\n", iRet, FileName);

    return 0;
}