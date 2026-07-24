// LB Assignment 46

/*///////////////////////////////////////////////////////////////////////////////////////

 4. Write a recursive program which accept number from user and return smallest digit
 Input : 87953
 Output : 3

/*///////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int Min(int iNo)
{

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    static int iMin = 9; 
    int iDigit = 0;


    if(iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit < iMin)
        {
            iMin = iDigit;
        }
        iNo = iNo / 10;

        Min(iNo);
    }

    return iMin;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = Min(iValue);

    printf("%d",iRet);

    return 0;
}