/* 4. Write a program which accept temperature in Fahrenheit and convert it into Celcius
 (1 celcius = (Fahrenheit - 32) * (5/9)) */
#include<stdio.h>

double FhtoCs(float fTemp)
{
    double dChange = 1.0;
    dChange = (fTemp - 32) * (5.0/9.0);

    return dChange;
}

int main()
{
    float fValue = 0.0f;
    double dRet = 0.0;

    printf("Enter temperature in Fahrenheit : \n");
    scanf("%f",&fValue);

    dRet = FhtoCs(fValue);

    printf(" Temperature in Celcius is : %lf\n", dRet);
    
    return 0;
}