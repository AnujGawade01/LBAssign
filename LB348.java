// LB Assignment 70 (66)

/*///////////////////////////////////////////////////////////////////////////////////////

4 . Software Dependency Resolver

A software project has dependencies:

Database -> Backend
Backend -> API
API -> Frontend

Determine a valid order in which modules should be initialized

Expected:

Database
Backend
API
Frontend

For a more complex input:

A -> C
B -> C
C -> D
B -> E
D -> F
E -> F

find a valid dependency order

/*///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class LB348 
{    
    public static List<String> findDependencyOrder(String[][] dependencies) 
    {
        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Integer> inDegree = new HashMap<>();
        
        for (String[] dep : dependencies) 
        {
            String u = dep[0];
            String v = dep[1];
            
            graph.putIfAbsent(u, new ArrayList<>());
            graph.putIfAbsent(v, new ArrayList<>());
            
            inDegree.putIfAbsent(u, 0);
            inDegree.putIfAbsent(v, 0);
        }
        
        for (String[] dep : dependencies) 
        {
            String u = dep[0];
            String v = dep[1];
            graph.get(u).add(v);
            inDegree.put(v, inDegree.get(v) + 1);
        }
        
        Queue<String> queue = new LinkedList<>();

        for (String node : inDegree.keySet()) 
        {
            if (inDegree.get(node) == 0) 
            {
                queue.add(node);
            }
        }
        
        List<String> order = new ArrayList<>();

        while (!queue.isEmpty()) 
        {
            String current = queue.poll();
            order.add(current);
            
            for (String neighbor : graph.get(current)) 
            {
                inDegree.put(neighbor, inDegree.get(neighbor) - 1);
                
                if (inDegree.get(neighbor) == 0) 
                {
                    queue.add(neighbor);
                }
            }
        }
        
        if (order.size() != inDegree.size()) 
        {
            System.out.println("Error: A cyclic dependency was detected!");
            return new ArrayList<>();
        }
        
        return order;
    }

    public static void main(String A[]) 
    {
        String[][] complexDeps = {
                                    {"A", "C"},
                                    {"B", "C"},
                                    {"C", "D"},
                                    {"B", "E"},
                                    {"D", "F"},
                                    {"E", "F"}
                                };
        
        System.out.println("Valid dependency order for complex input:");
        List<String> complexOrder = findDependencyOrder(complexDeps);
        System.out.println(complexOrder);

        String[][] simpleDeps = {
                                    {"Database", "Backend"},
                                    {"Backend", "API"},
                                    {"API", "Frontend"}
                                };
        
        System.out.println("\nValid dependency order for simple input:");
        List<String> simpleOrder = findDependencyOrder(simpleDeps);
        System.out.println(simpleOrder);
    }
}
