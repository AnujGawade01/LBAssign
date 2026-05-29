/* 5. Write a program which accept area in square feet and convert it into square meter
 (1 square feet = 0.0929 Square meter) */
#include<stdio.h>

double SquareMeter(int iValue)
{
    double dChange = 1.0;
    dChange = iValue * 0.0929;

    return dChange;
}

int main()
{
    int iValue = 0;
    double dRet = 0.0;

    printf("Enter area in square feet : \n");
    scanf("%d",&iValue);

    dRet = SquareMeter(iValue);

    printf(" Area in Square meter is : %lf\n", dRet);
    
    return 0;
}