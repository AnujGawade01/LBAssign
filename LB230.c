// LB Assignment 46

/*///////////////////////////////////////////////////////////////////////////////////////

 4. Write a recursive program which accept number from user and return its reverse number
 Input : 879
 Output : 978

/*///////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int Reverse(int iNo)
{
    static int Rev = 0;
    int iDigit = 0;

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        Rev = Rev * 10;
        Rev = Rev + iDigit;

        Reverse(iNo / 10);
    }

    return Rev;
    
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = Reverse(iValue);

    printf("%d",iRet);

    return 0;
}