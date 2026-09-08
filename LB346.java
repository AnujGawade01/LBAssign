// LB Assignment 70 (66)

/*///////////////////////////////////////////////////////////////////////////////////////

2 . Longest Consecutive Employee ID Sequence

Given IDs:

100
4
200
1
3
2
5

Find the longest consecutive sequence.

Output:

1 2 3 4 5

Length : 5

/*///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class LB346 
{
    public static void main(String A[]) 
    {
        int[] ids = {100, 4, 200, 1, 3, 2, 5};
        
        Set<Integer> idSet = new HashSet<>();

        for (int id : ids) 
        {
            idSet.add(id);
        }

        int maxLength = 0;

        List<Integer> longestSeq = new ArrayList<>();

        for (int id : ids) 
        {
            if (!idSet.contains(id - 1)) 
            {
                int currentId = id;
                int currentLength = 1;

                List<Integer> currentSeq = new ArrayList<>();
                currentSeq.add(currentId);

                while (idSet.contains(currentId + 1)) 
                {
                    currentId++;
                    currentSeq.add(currentId);
                    currentLength++;
                }

                if (currentLength > maxLength) 
                {
                    maxLength = currentLength;
                    longestSeq = currentSeq;
                }
            }
        }

        for (int val : longestSeq) 
        {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.println("Length : " + maxLength);
    }
}
