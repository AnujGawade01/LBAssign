// LB Assignment 42

/*///////////////////////////////////////////////////////////////////////////////////////

 4. Write generic program to accept N values and search last occurence of any specific
 value

*////////////////////////////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

template <class T>

int SearchLast(T *arr, int iSize, T iNo)
{
    int i = 0;
    int Pos = 0;

    for(i = 0; i < iSize; i++)
    {
        if(iNo == arr[i])
        {
            Pos = i+1;
        }
    }

    return Pos;
}

int main()
{
    int arr[] ={10,20,30,10,30,40,10,40,10};
    int iRet = SearchLast(arr,9,40);

    cout<<iRet;

    return 0;
}