// LB Assignment 70 (66)

/*///////////////////////////////////////////////////////////////////////////////////////

1 . Find two transactions matching a target

customer made transactions:
1200 500 700 300 1500

Find whether two transactions have a combined value of:

2000

Output:

500 + 1500 = 2000

/*///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class LB345
{
    public static void main(String A[])
    {
        int [] transactions = {1200,500,700,300,1500};
        int target = 2000;

        LinkedHashMap <Integer, Integer> entryCountMap = new LinkedHashMap <Integer, Integer> ();
        
        for (int id : transactions) 
        {
            entryCountMap.put(id, entryCountMap.getOrDefault(id, 0) + 1);
        }
        
        for (int i :entryCountMap.keySet())
        {
            int complement = target - i;

            if(entryCountMap.containsKey(complement))
            {
                if(i == complement && entryCountMap.get(i) < 2)
                {
                    continue;
                }

                System.out.println(i+" + "+complement+" = "+target);
                break;
            }
        }
    }
}
