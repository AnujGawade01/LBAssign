// LB Assignment 62 (58)

/*///////////////////////////////////////////////////////////////////////////////////////

4 . Write a program which accept matrix and display addition of elements from each column

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void AddColumn( int iRow, int iCol, int Arr[iRow][iCol])
{
    int i = 0, j = 0;
    int iAdd = 0;
    
    for(j = 0; j < iCol; j++)
    {
        iAdd = 0;

        for(i = 0; i < iRow; i++)
        {
            iAdd = iAdd + Arr[i][j];
        }

        printf("%d\t", iAdd);
    }
}

int main()
{
    int Row = 0;
    int Col = 0;
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
    
    AddColumn(Row,Col,Brr);

    return 0;
}