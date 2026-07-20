// LB Assignment 41

/*///////////////////////////////////////////////////////////////////////////////////////

 2. Write generic program to find largest number from three numbers

*////////////////////////////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

template <class T>

T Max(T no1, T no2, T no3)
{
    if(no1 > no2 && no1 > no3)
    {
        return no1;
    }
    else if(no2 > no1 && no2 > no3)
    {
        return no2;
    }
    else
    {
        return no3;
    }
}

int main()
{
    int iRet = Max(23,68,11);
    printf("Largest number is : %d\n",iRet);

    float fRet = Max(10.0f,77.6f,37.3f);
    printf("Largest number is : %f\n",fRet);

    return 0;
}