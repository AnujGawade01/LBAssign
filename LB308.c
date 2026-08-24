// LB Assignment 62 (58)

/*///////////////////////////////////////////////////////////////////////////////////////

5 . Write a program which accept matrix and swap the contents of consecutive rows

/*///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void SwapRows( int iRow, int iCol, int Arr[iRow][iCol])
{
    int i = 0, j = 0;
    int iAdd = 0;
    int temp = 0;
    
    while(i < iRow)
    {
        if(iRow % 2 != 0)
        {
            if(i == (iRow-1))
            {
                break;
            }
        }

        for(j = 0; j < iCol; j++)
        {
            temp = 0;
        
            temp = Arr[i][j];   
            Arr[i][j] = Arr[i+1][j];
            Arr[i+1][j] = temp;
        }
        
        i = i + 2;
    }

    for(i = 0; i < iRow; i++)
    {
        for(j = 0; j < iCol; j++)
        {
            printf("%d\t",Arr[i][j]);
        }
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
    
    SwapRows(Row,Col,Brr);

    return 0;
}