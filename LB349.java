// LB Assignment 70 (66)

/*///////////////////////////////////////////////////////////////////////////////////////

5 . Social Network Shortest Connection

A social networking application contains friendships:

Amit -> Rahul, Pooja
Rahul -> Neha
Pooja -> Kiran
Neha -> Riya
Kiran -> Riya

Find the minimum number of connections required to reach from:

Amit -> Riya

One possible path:

Amit -> Rahul -> Neha -> Riya

Number of connections:

/*///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class LB349 
{
    public static int findShortestConnection(String[][] friendships, String start, String end) 
    {
        Map<String, List<String>> graph = new HashMap<>();
        for (String[] edge : friendships) 
        {
            String person = edge[0];
            String friend = edge[1];
            
            graph.putIfAbsent(person, new ArrayList<>());
            graph.get(person).add(friend);
            
        }

        if (!graph.containsKey(start)) 
        {
            return -1; 
        }

        Queue<String> queue = new LinkedList<>();
        Map<String, Integer> distances = new HashMap<>();

        queue.add(start);
        distances.put(start, 0);

        while (!queue.isEmpty()) 
        {
            String current = queue.poll();
            int currentDistance = distances.get(current);

            if (current.equals(end)) 
            {
                return currentDistance;
            }

            if (graph.containsKey(current)) 
            {
                for (String neighbor : graph.get(current)) 
                {
                    if (!distances.containsKey(neighbor)) 
                    {
                        distances.put(neighbor, currentDistance + 1);
                        queue.add(neighbor);
                    }
                }
            }
        }

        return -1; 
    }

    public static void main(String[] args) 
    {
        String[][] friendships = 
                                {
                                    {"Amit", "Rahul"},
                                    {"Amit", "Pooja"},
                                    {"Rahul", "Neha"},
                                    {"Pooja", "Kiran"},
                                    {"Neha", "Riya"},
                                    {"Kiran", "Riya"}
                                };

        String start = "Amit";
        String end = "Riya";

        int connections = findShortestConnection(friendships, start, end);
        System.out.println("Number of connections from " + start + " to " + end + " is: " + connections);
    }
}

