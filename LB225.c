// LB Assignment 45

/*///////////////////////////////////////////////////////////////////////////////////////

 5. Write a recursive program which accept number from user and return its product of digits
 Input : 523
 Output : 30

/*///////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int Mult(int iNo)
{
    static int iSum = 1, iDigit = 0;

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        iSum = iSum * iDigit;
        iNo = iNo / 10;
        Mult(iNo);
    }

    return iSum;   
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = Mult(iValue);

    printf("%d",iRet);

    return 0;
}