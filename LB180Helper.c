// LB Assignment 36

/*///////////////////////////////////////////////////////////////////////////////////////

 5. Write a program which accept one number from user and on its first 4 bits.
  Return modified number.

 Write Helper & Entrypoint function separately

*////////////////////////////////////////////////////////////////////////////////////////

typedef unsigned int UINT;
 
UINT ToggleBit(UINT iNo)
{
    UINT iMask = 0XF;
    UINT iReturn = 0;

    iReturn = iMask | iNo;
    
    return iReturn;
}