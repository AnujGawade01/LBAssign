// LB Assignment 36

/*///////////////////////////////////////////////////////////////////////////////////////

 3. Write a program which accept one number from user and toggle 7th bit of that 
 number. Return modified number.

 Write Helper & Entrypoint function separately

*////////////////////////////////////////////////////////////////////////////////////////

typedef unsigned int UINT;
 
UINT ToggleBit(UINT iNo)
{
    UINT iMask = 0X40;
    UINT iReturn = 0;

    iReturn = iMask ^ iNo;
    
    return iReturn;
}
