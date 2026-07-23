// LB Assignment 43

/*///////////////////////////////////////////////////////////////////////////////////////

 1. Write a recursive program which display below pattern
 Output : * * * * * 

/*///////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void Display()
{   static int i = 0;
    if(i <= 4)
    {
        printf("*\t");
        i++;
        Display();
    }
}

int main()
{
    Display();

    return 0;
}
