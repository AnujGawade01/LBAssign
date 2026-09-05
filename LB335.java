// LB Assignment 68 (64)

/*///////////////////////////////////////////////////////////////////////////////////////

1 . A company records employee IDs whenever employees enter the office: 

Write a Java program that displays how many times each employee entered the office.

101 102 103 101 104 102 101 105

Expected output: 

101 -> 3
102 -> 2
103 -> 1
104 -> 1
105 -> 1

/*///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class LB335
{
    public static void main(String A[])
    {
        int[] employeeIds = {101, 102, 103, 101, 104, 102, 101, 105};
        
        LinkedHashMap <Integer, Integer> entryCountMap = new LinkedHashMap <Integer, Integer> ();
        
        for (int id : employeeIds) 
        {
            entryCountMap.put(id, entryCountMap.getOrDefault(id, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : entryCountMap.entrySet()) 
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
