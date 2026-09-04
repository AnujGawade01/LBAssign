// LB Assignment 67 (63)

/*///////////////////////////////////////////////////////////////////////////////////////

3 . Write a Java program that accepts a name of text file and performs analysis on its 
contents

Calculate:
 Total characters
 Total words
 Total lines
 Uppercase characters
 Lowercase characters
 Digits
 Spaces

/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class LB329
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
    
        String filename = "";

        System.out.println("Enter the File name : ");
        filename = sobj.nextLine();

        File fobj = new File(filename);

        if(!fobj.exists())
        {
            System.out.println(filename + " not found");
            return;
        }

        int totalCharacters = 0;
        int totalWords = 0;
        int totalLines = 0;
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitsCount = 0;
        int spacesCount = 0;

        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;

            while((line = reader.readLine()) != null)
            {
                totalLines++;
                totalCharacters = totalCharacters + line.length();

                String[] words = line.trim().split("\\s+");
                if(!line.trim().isEmpty())
                {
                    totalWords = totalWords + words.length;
                }

                for ( int i = 0; i < line.length(); i++)
                {
                    char ch = line.charAt(i);

                    if(Character.isUpperCase(ch))
                    {
                        uppercaseCount++;
                    }
                    else if(Character.isLowerCase(ch))
                    {
                        lowercaseCount++;
                    }
                    else if(Character.isDigit(ch))
                    {
                        digitsCount++;
                    }
                    else if(Character.isWhitespace(ch))
                    {
                        spacesCount++;
                    }

                }
            }

            System.out.println("Characters : " + totalCharacters);
            System.out.println("Words      : " + totalWords);
            System.out.println("Lines      : " + totalLines);
            System.out.println("Uppercase  : " + uppercaseCount);
            System.out.println("Lowercase  : " + lowercaseCount);
            System.out.println("Digits     : " + digitsCount);
            System.out.println("Spaces     : " + spacesCount);
            System.out.println();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        finally
        {
            sobj.close();
        }
    }
}