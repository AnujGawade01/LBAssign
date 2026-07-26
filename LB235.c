// LB Assignment 47

/*///////////////////////////////////////////////////////////////////////////////////////

 5. Write a program which accepts file name & one count from user and read that number 
 of characters from starting position
 Input : Demo.txt   12
 Output : Display first 12 characters

/*///////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<fcntl.h>
#include<io.h>
#include<stdlib.h>

void Display(char FName[], int iSize) 
{
    int fd = 0;
    char ch;
    
    fd = open(FName, O_RDONLY);
    if (fd == -1) 
    {
        printf("Unable to open file\n");
        return;
    }
    
    // Read and print one character at a time
    for (int i = 0; i < iSize; i++) 
    {
        if (read(fd, &ch, 1) == 0) 
        {
            break;
        }
        printf("%c", ch);
    }
    printf("\n");
    
    close(fd);
}

int main()
{
    char FileName[30];
    int iValue = 0;

    printf("Enter file name : \n");
    scanf("%s",FileName);

    printf("Enter the number of characters : \n");
    scanf(" %d",&iValue);

    Display(FileName,iValue);

    return 0;
}