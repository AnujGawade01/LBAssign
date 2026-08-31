// LB Assignment 66 (62)

/*///////////////////////////////////////////////////////////////////////////////////////

2 . Write a Java application that accepts a filename from the user and displays the complete
contents of that file

Requirements

 Use:
 FileInputStream
 
 Display an appropriate error message if the specified file does not exist

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class LB324
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
    
        String filename = "";

        System.out.println("Enter the File name : ");
        filename = sobj.nextLine();

        File fobj = new File(filename);

        if((!fobj.exists()) || !fobj.isFile())
        {
            System.out.println("File does not exists");
            return;
        }

        try(FileInputStream fis = new FileInputStream(fobj))
        {
            int fd = 0;

            while((fd = fis.read()) != -1)   
            {
                System.out.print((char)fd);
            } 
        }
        catch(IOException e)
        {
            System.out.println("Error occurred : "+e);
        }

        sobj.close();

    }
}