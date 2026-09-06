// LB Assignment 69 (65)

/*///////////////////////////////////////////////////////////////////////////////////////

4 . Given:

java python java c java python cpp

Generate:

java -> 3
python -> 2
c -> 1
cpp -> 1

Then find the most frequently occuring word

Expected:

Most frequent word : java
Frequency : 3

/*///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class LB343
{
    public static void main(String A[])
    {
        String [] str = {"java", "python", "java", "c", "java", "python", "cpp"};
        
        LinkedHashMap <String, Integer> entryCountMap = new LinkedHashMap <String, Integer> ();
        
        for (String s : str) 
        {
            entryCountMap.put(s, entryCountMap.getOrDefault(s, 0) + 1);
        }
        
        for (Map.Entry<String, Integer> entry : entryCountMap.entrySet()) 
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        String mostFrequentWord = "";
        int maxFrequency = 0;
        
        for (Map.Entry<String, Integer> entry : entryCountMap.entrySet()) 
        {
            if (entry.getValue() > maxFrequency) 
            {
                maxFrequency = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }
        
        System.out.println("Most frequent word : " + mostFrequentWord);
        System.out.println("Frequency : " + maxFrequency);
    }
}
