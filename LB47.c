/* 2. Write a program which accept height & width of rectangle from user and calculate its area 
 (Area = Width * Height) */
#include<stdio.h>

float RectArea(float fWidth, float fHeight)
{
    double dArea = 1.0;

    dArea = fWidth * fHeight;

    return dArea;
}

int main()
{
    float fValue1 = 0.0f, fValue2 = 0.0f;
    double dRet = 0.0;

    printf("Enter width : \n");
    scanf("%f",&fValue1);

    printf("Enter height : \n");
    scanf("%f",&fValue2);

    dRet = RectArea(fValue1, fValue2);

    printf(" Area of rectangle is : %lf\n", dRet);
    
    return 0;
}