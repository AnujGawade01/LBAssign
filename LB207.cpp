// LB Assignment 42

/*///////////////////////////////////////////////////////////////////////////////////////

 2. Write generic program to accept N values and count frequency of any specific value

*////////////////////////////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

template <class T>

int Frequency(T *arr, int iSize, T iNo)
{
    int i = 0;
    int Freq = 0;

    for(i = 0; i < iSize; i++)
    {
        if(iNo == arr[i])
        {
            Freq++;
        }
        
    }

    return Freq;
}

int main()
{
    int arr[] ={10,20,30,10,30,40,10,40,10};
    int iRet = Frequency(arr,9,10);

    cout<<iRet;

    return 0;
}