// LB Assignment 63 (59)

/*///////////////////////////////////////////////////////////////////////////////////////

1 . Write a program which accept matrix from user and display transpose of the matrix

The transpose of a given matrix is formed by interchanging the rows and columns of a matrix

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void Transpose( int iRow, int iCol, int Arr[iRow][iCol])
{
    int i = 0, j = 0;

    int New[iCol][iRow];
    
    for(i = 0; i < iRow; i++)
    {
        for(j = 0; j < iCol; j++)
        {
            New[j][i] = Arr[i][j];
        }
    }

    for(i = 0; i < iRow; i++)
    {
        for(j = 0; j < iCol; j++)
        {
            printf("%d\t",New[i][j]);
        }
        printf("\n");
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
    
    Transpose(Row,Col,Brr);

    return 0;
}