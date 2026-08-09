// LB Assignment 51

/*///////////////////////////////////////////////////////////////////////////////////////

 2. Write java program to accept directory name from user and write names of all files from
 that directory into one newly created file named as "Marvellous.txt"
 
/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class LB252 
{
    public static void main(String Args[]) throws Exception
    {
        Scanner sobj = null;
        String dirpath = null;
        FileWriter fwriter = null;
        
        sobj = new Scanner(System.in);

        System.out.println( "Enter the Directory path : ");
        dirpath =  sobj.nextLine();

        File fobj = new File(dirpath);

        if(fobj.exists() && fobj.isDirectory())
        {
            File[] fileList = fobj.listFiles();

            File outputFile = new File("Marvellous.txt");
            fwriter = new FileWriter(outputFile);

            System.out.println("\n--- Writing files to Marvellous.txt ---");
            int fileCount = 0;

            if (fileList != null && fileList.length > 0) 
            {
                for (File file : fileList) 
                {
                    if (file.isFile()) 
                    {
                        fwriter.write(file.getName() + "\n");
                        fileCount++;
                    }
                }
                
                if (fileCount > 0) {
                    System.out.println("Successfully wrote " + fileCount + " file names.");
                    System.out.println("Output saved at: " + outputFile.getAbsolutePath());
                }
                else
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
        fwriter.close();
    }
}