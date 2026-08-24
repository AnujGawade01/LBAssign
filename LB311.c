// LB Assignment 63 (59)

/*///////////////////////////////////////////////////////////////////////////////////////

3 . Write a program which accept matrix from user and reverse the contents of each colum

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void ReverseCol( int iRow, int iCol, int Arr[iRow][iCol])
{
    int i = 0, j = 0;
    int iStart = 0, iEnd = 0;
    int temp = 0;
    iEnd = iRow-1;
    
    for(j = 0; j < iCol; j++)
    {
        iStart = 0;
        iEnd = iRow-1;

        while(iStart < iEnd)
        {
            temp = Arr[iStart][j];
            Arr[iStart][j] = Arr[iEnd][j];
            Arr[iEnd][j] = temp;

            iStart++;
            iEnd--;
        }
    }

    for(i = 0; i < iRow; i++)
    {
        for(j = 0; j < iCol; j++)
        {
            printf("%d\t",Arr[i][j]);
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
    
    ReverseCol(Row,Col,Brr);

    return 0;
}