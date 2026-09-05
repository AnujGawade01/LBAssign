// LB Assignment 68 (64)

/*///////////////////////////////////////////////////////////////////////////////////////

4 . A banking application receives transaction IDs :

TX101
TX102
TX103
TX101
TX104
TX102

Identify duplicate transaction IDs 
 
Expected Output: 

 Duplicate transactions :
 TX101
 TX102

/*///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class LB338
{
    public static void main(String A[])
    {
        String transactions[] = {"TX101","TX102","TX103","TX101","TX104","TX102"};

        HashSet <String> unique = new HashSet <String> ();
        HashSet <String> duplicate = new HashSet <String> ();

        for(String str : transactions)
        {
            if(!unique.add(str))
            {
                duplicate.add(str);
            }
        }

        System.out.println("Unique : "+unique);

        System.out.println("Duplicate : "+duplicate);
    }
}