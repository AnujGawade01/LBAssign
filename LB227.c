// LB Assignment 46

/*///////////////////////////////////////////////////////////////////////////////////////

 2. Write a recursive program which accept number from user and return largest digit
 Input : 87967
 Output : 9

/*///////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int Max(int iNo)
{
    static int iMax = 0, iDigit = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit > iMax)
        {
            iMax = iDigit;
        }
        iNo = iNo / 10;

        Max(iNo);
    }

    return iMax;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = Max(iValue);

    printf("%d",iRet);

    return 0;
}