// LB Assignment 50

/*///////////////////////////////////////////////////////////////////////////////////////

 5. Write java program to accept directory name from user and display all names of files 
 from that directory and size of each file on screen
 
/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class LB250
{
    public static void main(String Args[]) throws Exception
    {
        Scanner sobj = null;
        String dirpath = null;
        
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
                    
                    System.out.println("File Name: " + file.getName() + " | Size: " + file.length() + " bytes");
                    fileCount++;
                    
                }
                
                if (fileCount == 0) 
                {
                    System.out.println("No files found.");
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
        
        sobj.close();
    }
}
