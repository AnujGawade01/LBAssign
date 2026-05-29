/* 4. Write a program which accepts number from user and return multiplication of all digits. */
#include<stdio.h>

int MultDigits(int iNo)
{
    int iCount = 0;
    int iDigit = 0;

    if (iNo < 0) 
    {
        iNo = -iNo;
    }
    
    iCount = 1;
    while(iNo > 0)
    {
        iDigit = iNo % 10;
        if(iDigit != 0)
        {
            iCount = iCount * iDigit;
        }
        iNo = iNo / 10;
        
    }

    return iCount;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = MultDigits(iValue);

    printf("%d\n", iRet);
    
    return 0;
}