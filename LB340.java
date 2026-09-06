// LB Assignment 69 (65)

/*///////////////////////////////////////////////////////////////////////////////////////

1 . A browser wants to store only the last 5 visited websites.

Visits:

google.com
github.com
openai.com
oracle.com
stackoverflow.com
youtube.com

After all visits, history should contain:

github.com
openai.com
oracle.com
stackoverflow.com
youtube.com

/*///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class LB340
{
    public static void main(String A[])
    {
        String visited[] = {"google.com", "github.com", "openai.com", 
                            "oracle.com", "stackoverflow.com", "youtube.com"};
        
        ArrayDeque <String> history = new ArrayDeque <String> ();

        for(String site : visited)
        {
            history.add(site);

            if(history.size() > 5)
            {
                history.poll();
            }
        }

        System.out.println("History contains : ");
        for(String site : history)
        {
            System.out.println(site);
        }
    }
}
