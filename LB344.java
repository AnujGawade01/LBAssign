// LB Assignment 69 (65)

/*///////////////////////////////////////////////////////////////////////////////////////

5 . An e-commerce application records product IDs:

101 102 101 103 101 102 104 105 102 102 103

Find the top 2 most frequently purchased products

Expected:
102 -> 4
101 -> 3

/*///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class LB344
{
    public static void main(String A[])
    {
        int [] productIDs = {101,102,101,103,101,102,104,105,102,102,103};

        LinkedHashMap <Integer, Integer> entryCountMap = new LinkedHashMap <Integer, Integer> ();
        
        for (Integer id : productIDs) 
        {
            entryCountMap.put(id, entryCountMap.getOrDefault(id, 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>> (entryCountMap.entrySet());

        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (int i = 0; i < 2; i++) 
        {
            Map.Entry<Integer, Integer> entry = list.get(i);
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
