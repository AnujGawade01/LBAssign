// LB Assignment 49

/*///////////////////////////////////////////////////////////////////////////////////////

 5. Write java program to accept directory name from user and display all names of files
 from that directory
 
/*///////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class LB244
{
    public static void main(String Args[])
    {
        Scanner sobj = null;
        String dirpath = "";


        try
        {
            sobj = new Scanner(System.in);

            System.out.println( "Enter the Directory path : ");
            dirpath =  sobj.nextLine();

            File fobj = new File(dirpath);

            if(fobj.exists() && fobj.isDirectory())
            {
                File[] fileList = fobj.listFiles();

                System.out.println("\n--- Directory Files ---");
                int fileCount = 0;

                if (fileList != null && fileList.length > 0) 
                {
                    for (File file : fileList) 
                    {
                        if (file.isFile()) 
                        {
                            System.out.println(file.getName());
                            fileCount++;
                        }
                    }
                    
                    if (fileCount == 0) 
                    {
                        System.out.println("No files found (the directory only contains folders or is empty).");
                    }
                } 
                else 
                {
                    System.out.println("The directory is empty.");
                }
                System.out.println("--------------------------");
                
            } 
            else 
            {
                System.out.println("Error: The path provided does not exist or is not a directory.");
            }
        }
        
        finally 
        {
            if (sobj != null) 
            {
                sobj.close();
            }
        }
    }
}