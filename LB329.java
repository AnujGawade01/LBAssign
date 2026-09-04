// LB Assignment 67 (63)

/*///////////////////////////////////////////////////////////////////////////////////////

2 . Write a Java program that accepts a directory path and a filename from the user

Search for the specified file inside the directory

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class LB329
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
    
        String dirname = "";
        String filename = "";

        System.out.println("Enter the Directory name : ");
        dirname = sobj.nextLine();

        System.out.println("Enter the File name : ");
        filename = sobj.nextLine();

        File dirobj = new File(dirname);

        File fobj = new File(filename);

        if(!dirobj.exists())
        {
            System.out.println("Directory does not exists");
            return;
        }

        if(!dirobj.isDirectory())
        {
            System.out.println("It is not a directory");
            return;
        }

        if(!fobj.exists())
        {
            System.out.println(filename + " not found");
            return;
        }
        else
        {
            System.out.println("File found");
            System.out.println();
        }

        System.out.println("Name : " + fobj.getName());
        System.out.println("Size : " + fobj.length()+" bytes");
        System.out.println("Path  : " + fobj.getAbsolutePath());
        System.out.println();
        
        sobj.close();
    }
}