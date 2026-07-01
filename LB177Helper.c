// LB Assignment 36

/*///////////////////////////////////////////////////////////////////////////////////////

 2. Write a program which accept one number from user and off 7th & 10th bit of that 
 number. Return modified number.

 Write Helper & Entrypoint function separately

*////////////////////////////////////////////////////////////////////////////////////////

typedef unsigned int UINT;
 
UINT OffBit(UINT iNo)
{
    UINT iMask1 = 0XFFFFFFBF, iMask2 = 0XFFFFFDFF;
    UINT iMask = 0;
    UINT iReturn = 0;

    iMask = iMask1 & iMask2;
    iReturn = iMask & iNo;
    
    return iReturn;
}
