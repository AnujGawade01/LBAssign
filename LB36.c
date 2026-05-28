// LB Assignment 8
/* 1. Write a program which accept radius of circle from user and calculate its area 
Consider value of PI as 3.14 (Area = PI * Radius * Radius) */
#include<stdio.h>

float CircleArea(float fRadius)
{
    double dArea = 1.0;
    const float fPI = 3.14f;

    dArea = fPI * fRadius * fRadius;

    return dArea;
}

int main()
{
    float fValue = 0.0f;
    double dRet = 0.0;

    printf("Enter radius : \n");
    scanf("%f",&fValue);

    dRet = CircleArea(fValue);

    printf(" Area of circle is : %lf\n", dRet);
    
    return 0;
}