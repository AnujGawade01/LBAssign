// LB Assignment 44

/*///////////////////////////////////////////////////////////////////////////////////////

 3. Write a recursive program which display below pattern
 Input : 5
 Output : 5 4 3 2 1

/*///////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void Display(int iNo)
{
    if(0 != iNo)
    {
        printf("%d\t",iNo);
        iNo--;
        Display(iNo);
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}