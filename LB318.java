// LB Assignment 65 (61)

/*///////////////////////////////////////////////////////////////////////////////////////

1 . Develop a client server application that performs different string operations
The client should send command containing an operation and a string : 

Supported commands :
LENGTH <string>
UPPER <string>
LOWER <string>
REVERSE <string>
PALINDROME <string>
VOWELS <string>

Requirements:
The server should perform all string processing. The client should only accept input and 
display the response.

/*///////////////////////////////////////////////////////////////////////////////////////

/*///////////////////////////////////////////////////////////////////////////////////////

                                        Server

/*///////////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.net.*;

class LB318
{
    public static void main(String A[])
    {
        try
        {
            ServerSocket serversocket = new ServerSocket(7777);

            System.out.println("-----------------------------------");
            System.out.println("-----Marvellous Server Started-----");
            System.out.println("-----------------------------------");

            while(true)
            {
                System.out.println("Server is waiting for client request");

                Socket clientsocket = serversocket.accept();

                System.out.println("Client connected successfully");

                Thread tobj = new Thread(() -> HandleClientRequest(clientsocket));

                tobj.start();
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : "+e);
        }
    }


    public static void HandleClientRequest(Socket socket)
    {
        try
        {
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeUTF("Connected to the Server");

            while(true)
            {
                String command = dis.readUTF().trim();

                System.out.println("Command received from client : "+command);

                String[] parts = command.split(" ",2);

                String operation = parts[0].toUpperCase();

                if(parts.length != 2)
                {
                    dos.writeUTF("Invalid command");
                    continue;
                }

                String Str = parts[1];
                String result = null;

                if(operation.equals("LENGTH"))
                {
                    int len = Str.length();
                    dos.writeUTF("Length of string is : "+len);
                }
                else if(operation.equals("UPPER"))
                {
                    result = Str.toUpperCase();
                    dos.writeUTF(result);
                }
                else if(operation.equals("LOWER"))
                {
                    result = Str.toLowerCase();
                    dos.writeUTF(result);
                }
                else if(operation.equals("REVERSE"))
                {
                    Str = Str.toLowerCase();
                    char[] Arr = Str.toCharArray();

                    int left = 0;
                    int right = Arr.length - 1;

                    while(left < right)
                    {
                        char temp = Arr[left];
                        Arr[left] = Arr[right];
                        Arr[right] = temp;

                        left++;
                        right--;
                    }
                    
                    String Rev = new String(Arr);

                    dos.writeUTF(Rev);
                }
                else if(operation.equals("PALINDROME"))
                {
                    Str = Str.toLowerCase();
                    char[] Arr = Str.toCharArray();

                    int left = 0;
                    int right = Arr.length - 1;

                    while(left < right)
                    {
                        char temp = Arr[left];
                        Arr[left] = Arr[right];
                        Arr[right] = temp;

                        left++;
                        right--;
                    }
                    
                    String Rev = new String(Arr);

                    if(Rev.equals(Str))
                    {
                        dos.writeUTF("String is Palindrome");
                    }
                    else
                    {
                        dos.writeUTF("String is not Palindrome");
                    }
                }
                else if(operation.equals("VOWELS"))
                {
                    int iCount = 0;
                    Str = Str.toLowerCase();
                    char[] Arr = Str.toCharArray();

                    for(int i = 0; i < Arr.length; i++)
                    {
                        if((Arr[i] == 'a') 
                        || (Arr[i] == 'e') 
                        || (Arr[i] == 'i') 
                        || (Arr[i] == 'o')
                        || (Arr[i] == 'u'))
                        {
                            iCount++;
                        }
                    }
                    dos.writeUTF("Number of vowels : "+iCount);
                }        
                else
                {
                    dos.writeUTF("Invalid operation");
                }
            }
            socket.close();
            dis.close();
            dos.close();

            System.out.println("Client disconnected");    

        }
        catch(Exception e)
        {
            System.out.println("Exception occured : "+e);
        }
    }
}