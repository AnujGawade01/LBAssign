// LB Assignment 65 (61)

/*///////////////////////////////////////////////////////////////////////////////////////

3 . Write a Java program that accepts a filename from the user and creates a new file on 
the local machine

Requirements

Display:
 File Name
 Absolute Path
 Whether file creation was successful

Use the File class

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class LB322
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
    
        String filename = "";

        System.out.println("Enter the File name : ");
        filename = sobj.nextLine();

        File fobj = new File(filename);

        try
        {
            boolean created = fobj.createNewFile();

            if(created)
            {    
                System.out.println("File Name: "+fobj.getName());
                System.out.println("File Path: "+fobj.getAbsolutePath());
                System.out.println("File Created Successfully");
            }
            else
            {
                
                System.out.println("File was not created");
            }
        }
        catch(IOException e)
        {
            System.out.println("Error occurred : "+e);
        }

    }
}