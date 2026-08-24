// LB Assignment 62 (58)

/*///////////////////////////////////////////////////////////////////////////////////////

1 . Write a program which accept matrix from user and return addition of diagonal elements

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

int AddDiagonal( int iRow, int iCol, int Arr[iRow][iCol])
{
    int Add = 0;
    int i = 0, j = 0;
    
    for(i = 0; i < iRow; i++)
    {
        for(j = 0; j < iCol; j++)
        {
            if(i == j)
            {
                Add = Add + Arr[i][j];
            }
        }
    }

    return Add;
}

int main()
{
    int Row = 0;
    int Col = 0;
    int iRet = 0;
    int i = 0, j = 0;
    
    printf("Enter the number of Rows : \n");
    scanf("%d",&Row);

    printf("Enter the number of Columns : \n");
    scanf("%d",&Col);

    int Brr[Row][Col];

    printf("Enter the Elements of the Matrix: \n");
    
    for(i = 0; i < Row; i++)
    {
        for(j = 0; j < Col; j++)
        {
            scanf("%d",&Brr[i][j]);
        }
    }
    
    iRet = AddDiagonal(Row,Col,Brr);

    printf("Addition is : %d",iRet);

    return 0;
}