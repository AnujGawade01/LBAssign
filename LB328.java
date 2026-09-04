// LB Assignment 67 (63)

/*///////////////////////////////////////////////////////////////////////////////////////

1 . Extend the previous assignment to distinguish between files and directories

for files also display their sizes

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class LB328
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
                if (file.isDirectory()) 
                {
                    System.out.println("[DIR]  " + file.getName());
                } 
                else 
                {
                    System.out.print("[FILE] " + file.getName()+"\t\t");
                    System.out.print(file.length()+" bytes");
                    System.out.println();
                }
            }
        }
        sobj.close();
    }
}