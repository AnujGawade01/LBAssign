// LB Assignment 42

/*///////////////////////////////////////////////////////////////////////////////////////

 5. Write generic program to accept N values and reverse the contents

*////////////////////////////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

template <class T>

void Reverse(T *arr, int iSize)
{
    T *start = arr;
    T *end = arr + (iSize - 1);
    T temp;

    while(start < end)
    {
        temp = *start;
        *start = *end;
        *end = temp;

        start++;
        end--;
    }
}

int main()
{
    int arr[] ={10,20,30,10,30,40,10,40,10};
    

    for(int i = 0; i < 9; i++)
    {
        cout<<arr[i]<<"\t";
    }

    Reverse(arr,9);

    cout<<"\n";

    for(int i = 0; i < 9; i++)
    {
        cout<<arr[i]<<"\t";
    }
    return 0;
}