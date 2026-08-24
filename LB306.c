// LB Assignment 62 (58)

/*///////////////////////////////////////////////////////////////////////////////////////

3 . Write a program which accept matrix and return largest number from both the diagonals

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

int MaxDiagonal( int iRow, int iCol, int Arr[iRow][iCol])
{
    int i = 0, j = 0;
    int iMax = 0;
    int LenCol = iCol-1;
    int LenRow = 0;
    
    for(i = 0; i < iRow; i++)
    {
        for(j = 0; j < iCol; j++)
        {
            if(i == j || (j == LenCol) && (i == LenRow))
            {
                if(iMax < Arr[i][j])
                {
                    iMax = Arr[i][j];
                    printf("%d\n",iMax);
                }
            }
        }

        LenCol--;
        LenRow++;
    }

    return iMax;
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
    
    iRet = MaxDiagonal(Row,Col,Brr);

    printf("Largest number is : %d",iRet);

    return 0;
}