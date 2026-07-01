// LB Assignment 36

/*///////////////////////////////////////////////////////////////////////////////////////

 1. Write a program which accept one number from user and off 7th bit of that number if 
 it is on. Return modified number.

 Write Helper & Entrypoint function separately

*////////////////////////////////////////////////////////////////////////////////////////

typedef unsigned int UINT;
 
UINT OffBit(UINT iNo)
{
    UINT iMask = 0XFFFFFFBF;
    UINT iReturn = 0;

    iReturn = iMask & iNo;
    
    return iReturn;
}
