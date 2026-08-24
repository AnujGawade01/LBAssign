// LB Assignment 63 (59)

/*///////////////////////////////////////////////////////////////////////////////////////

5 . Write a program which accept matrix and check whether the matrix is Sparse or not

Sparse matrix is matrix with the majority of its elements equal to zero

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdbool.h>

bool ChkSparse( int iRow, int iCol, int Arr[iRow][iCol])
{
    int i = 0, j = 0;
    int iCount = 0;
    int Limit = 0;
    int NonZero = 0;

    Limit = (iRow * iCol) / 2;

    for(i = 0; i < iRow; i++)
    {
        for(j = 0; j < iCol; j++)
        {
            if((Arr[i][j]) == 0)
            {
                iCount++;

                if(iCount > Limit)
                {
                    return true;
                }
            }
        }
    }


    return false;
}

int main()
{
    int Row = 0;
    int Col = 0;
    int i = 0, j = 0;
    bool bRet = false;
    
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
    
    bRet = ChkSparse(Row,Col,Brr);

    if(bRet == true)
    {
        printf("It is a Sparse matrix\n");
    }
    else
    {
        printf("It is not a Sparse matrix\n");
    }

    return 0;
}