// LB Assignment 64 (60)

/*///////////////////////////////////////////////////////////////////////////////////////

1 . Develop a multithreaded client server application in Java that performs mathematical
operations remotely
The client should accept a command from user and send that command to the server
The server should parse the received command perform the requested mathematical operation,
and return the result to the client
The server should support the following commands:

ADD <No1> <No2>
SUB <No1> <No2>
MULT <No1> <No2>
DIV <No1> <No2>
MOD <No1> <No2>
MAX <No1> <No2>
MIN <No1> <No2>
QUIT

Requirements:
Server should run continuously
Multiple clients should be handled properly
Division by Zero should be handled
Quit should disconnect only the current client

/*///////////////////////////////////////////////////////////////////////////////////////

/*///////////////////////////////////////////////////////////////////////////////////////

                                        Server

/*///////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.net.*;
import java.util.*;

class LB314
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

                // Thread gets created for client
                Thread t = new Thread(() -> HandleClientRequest(clientsocket));
                
                t.start();
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

            dos.writeUTF("Connected to Math Server");

            while(true)
            {
                String command = dis.readUTF();

                System.out.println("Command received from client : "+command);

                String parts[] = command.split(" ");

                String operation = parts[0].toUpperCase();

                if(operation.equals("QUIT"))
                {
                    dos.writeUTF("Disconnected from server");
                    break;
                }

                if(parts.length != 3)
                {
                    dos.writeUTF("Invalid command format");
                    continue;
                }

                double no1 = Double.parseDouble(parts[1]);
                double no2 = Double.parseDouble(parts[2]); 

                double result = 0.0;

                if(operation.equals("ADD"))
                {
                    result = no1 + no2;

                    dos.writeUTF("Result is : "+result);
                }
                else if(operation.equals("SUB"))
                {
                    result = no1 - no2;

                    dos.writeUTF("Result is : "+result);
                }
                else if(operation.equals("MULT"))
                {
                    result = no1 * no2;

                    dos.writeUTF("Result is : "+result);
                }
                else if(operation.equals("DIV"))
                {
                    if(no1 == 0.0 || no2 == 0.0)
                    {
                        result = 0.0;
                    }
                    else
                    {
                        result = no1 / no2;
                    }
                    
                    dos.writeUTF("Result is : "+result);
                }
                else if(operation.equals("MOD"))
                {
                    result = no1 % no2;

                    dos.writeUTF("Result is : "+result);
                }
                else if(operation.equals("MAX"))
                {
                    if(no1 > no2)
                    {
                        result = no1;
                    }
                    else
                    {
                        result = no2;
                    }
                    dos.writeUTF("Result is : "+result);
                }
                else if(operation.equals("MAX"))
                {
                    if(no1 < no2)
                    {
                        result = no1;
                    }
                    else
                    {
                        result = no2;
                    }
                    dos.writeUTF("Result is : "+result);
                }
                else
                {
                    dos.writeUTF("Invalid operation");
                }
            }    
            
            socket.close();

            System.out.println("Client disconnected");    

        }
        catch(Exception e)
        {
            System.out.println("Exception occured : "+e);
        }
    }
}

