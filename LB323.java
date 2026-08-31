// LB Assignment 66 (62)

/*///////////////////////////////////////////////////////////////////////////////////////

1 . Write a Java program that accepts a filename and textual data from the user and stores
that data inside the specified file

Requirements

 Use:
 FileOutputStream
 Do not use higher level utility functions for writing the complete file

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class LB323
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
    
        String filename = "";
        String Data = "";

        System.out.println("Enter the File name : ");
        filename = sobj.nextLine();

        System.out.println("Enter the data to store : ");
        Data = sobj.nextLine();

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

            FileOutputStream fos = new FileOutputStream(fobj);

            fos.write(Data.getBytes());


            fos.close();
        }
        catch(IOException e)
        {
            System.out.println("Error occurred : "+e);
        }

    }
}