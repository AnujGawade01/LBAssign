// LB Assignment 45

/*///////////////////////////////////////////////////////////////////////////////////////

 4. Write a recursive program which accept number from user and return its factorial
 Input : 5
 Output : 120

/*///////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int Fact(int iNo)
{
    static int iSum = 1;

    if(iNo != 0)
    {
        iSum = iSum * iNo;
        iNo--;
        Fact(iNo);
    }
    return iSum;   
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = Fact(iValue);

    printf("%d",iRet);

    return 0;
}