// LB Assignment 69 (65)

/*///////////////////////////////////////////////////////////////////////////////////////

2 . Customers submit support requests:

R101
R102
R103
R104

Requests must normally be handled in the same order in which they arrive

Implement:
 addRequest()
 processRequest()
 showPendingRequest()

/*///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class LB341
{
    public static void main(String A[])
    {
        String supportIDs[] = {"R101","R102","R103","R104"};

        SupportSystem system = new SupportSystem();

        System.out.println("--- Customer Submissions ---");
        for (String id : supportIDs) 
        {
            system.addRequest(id);
        }

        System.out.println("\n--- Viewing Current Queue ---");
        system.showPendingRequests();

        System.out.println("\n--- Request Processing ---");
        system.processRequest(); // Processes R101
        system.processRequest(); // Processes R102

        System.out.println("\n--- Viewing Remaining Queue ---");
        system.showPendingRequests();
        
    }
}

class SupportSystem 
{
    private Queue <String> requestQueue;

    // Constructor
    public SupportSystem() 
    {
        this.requestQueue = new LinkedList<>();
    }

    public void addRequest(String id) 
    {
        requestQueue.add(id);
        System.out.println("Added request: " + id);
    }

    public void processRequest() 
    {
        if (requestQueue.isEmpty()) 
        {
            System.out.println("No pending requests to process.");
            return;
        }
        String processed = requestQueue.poll();
        System.out.println("Processed request: " + processed);
    }

    public void showPendingRequests() 
    {
        if (requestQueue.isEmpty()) 
        {
            System.out.println("No pending requests.");
            return;
        }

        System.out.println("Pending requests: " + requestQueue);
    }
}