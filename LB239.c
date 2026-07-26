// LB Assignment 48

/*///////////////////////////////////////////////////////////////////////////////////////

 4. Write application which accepts file name from user and display size of file

 Input : Demo.txt   
 Output : File size
 
/*///////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<fcntl.h>

int Displaysize(char FName[])  
{
    int fd = 0, size = 0;
    
    fd = open(FName, O_RDONLY); 
    
    if (fd == -1) 
    {
        printf("Unable to create file\n");
        return -1;
    }


    size = lseek(fd, 0, SEEK_END);

    return size;
}

int main()
{
    char FileName[30];
    int FileSize = 0;

    printf("Enter file name : \n");
    scanf("%s",FileName);

    FileSize = DisplaySize(FileName);

    if (FileSize != -1) {
        printf("File size is : %d bytes \n", FileSize);
    }

    return 0;
}