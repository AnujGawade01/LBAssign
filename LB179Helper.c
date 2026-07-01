// LB Assignment 36

/*///////////////////////////////////////////////////////////////////////////////////////

 4. Write a program which accept one number from user and toggle 7th & 10th bit of that 
 number. Return modified number.

 Write Helper & Entrypoint function separately

*////////////////////////////////////////////////////////////////////////////////////////

typedef unsigned int UINT;
 
UINT ToggleBit(UINT iNo)
{
    UINT iMask1 = 0X40, iMask2 = 0X200;
    UINT iReturn = 0;
    UINT iMask = 0;

    iMask = iMask1 | iMask2;

    iReturn = iMask ^ iNo;
    
    return iReturn;
}