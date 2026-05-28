/* 3. Write a program which accept distance in kilometre and convert it into meter
 (1 Kilometre = 1000 Meter) */
#include<stdio.h>

float KMtoMeter(int iNo)
{
    iNo = iNo * 1000;

    return iNo;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter distance : \n");
    scanf("%d",&iValue);

    iRet = KMtoMeter(iValue);

    printf(" Distance in Meter is : %d\n", iRet);
    
    return 0;
}