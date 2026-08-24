// LB Assignment 63 (59)

/*///////////////////////////////////////////////////////////////////////////////////////

4 . Write a program which accept matrix and check whether the matrix is identity matrix or
not

Identity matrix is square matrix with 1 along the diagonal from upper left to lower right
and 0 in all other positions

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdbool.h>

bool ChkIdentity( int iRow, int iCol, int Arr[iRow][iCol])
{
    int i = 0, j = 0;

    if(iRow != iCol)
    {
        return false;
    }
    else
    {
        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if((i == j) && (Arr[i][j] != 1))
                {
                    return false;
                }

                if((i != j) && (Arr[i][j] != 0))
                {
                    return false;
                }
            }
        }
    }


    return true;
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
    
    bRet = ChkIdentity(Row,Col,Brr);

    if(bRet == true)
    {
        printf("It is a identity matrix\n");
    }
    else
    {
        printf("It is not a identity matrix\n");
    }

    return 0;
}