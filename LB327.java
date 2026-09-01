// LB Assignment 66 (62)

/*///////////////////////////////////////////////////////////////////////////////////////

5 . Write a Java application that accepts the path of a directory and displays all files
and directories present inside it.

Requirements

 Check whether the supplied path
  Exists
  Is actually a directory
 Display all its contents

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class LB327
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
    
        String dirname = "";

        System.out.println("Enter the Directory name : ");
        dirname = sobj.nextLine();

        File fobj = new File(dirname);

        if(!fobj.exists())
        {
            System.out.println("Directory does not exists");
            return;
        }

        if(!fobj.isDirectory())
        {
            System.out.println("It is not a directory");
            return;
        }

        System.out.println("Directory Name : " + fobj.getName());
        System.out.println("Absolute Path  : " + fobj.getAbsolutePath());

        System.out.println("\n--- Contents of the Directory ---");
        File[] fileList = fobj.listFiles();

        if (fileList == null || fileList.length == 0) 
        {
            System.out.println("The directory is empty.");
        } 
        else 
        {
            for (File file : fileList) 
            {
                
                System.out.println(file.getName());
                
            }
        }


        sobj.close();

    }
}
