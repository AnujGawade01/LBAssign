// LB Assignment 48

/*///////////////////////////////////////////////////////////////////////////////////////

 3. Write application which accepts file name from user and read all data from that file 
 display contents on screen

 Input : Demo.txt   
 Output : Display all data of file
 
/*///////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<fcntl.h>

void Display(char FName[])  
{
    int fd = 0, ret = 0;
    char Buffer[1024];
    
    fd = open(FName, O_RDONLY); 
    
    if (fd == -1) 
    {
        printf("Unable to create file\n");
        return;
    }
    else
    {
        while((ret = read(fd, Buffer, sizeof(Buffer) - 1)) > 0) 
        {
            Buffer[ret] = '\0';
            printf("%s", Buffer);
        }
    }
}

int main()
{
    char FileName[30];

    printf("Enter file name : \n");
    scanf("%s",FileName);

    Display(FileName);

    return 0;
}