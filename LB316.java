// LB Assignment 64 (60)

/*///////////////////////////////////////////////////////////////////////////////////////

2 . Develop a client server application where the server performs different number related
operations requested by the client
The client should send commands in the following format : 

EVEN <number>
ODD <number>
PRIME <number>
PERFECT <number>
FACTORIAL <number>
REVERSE <number>

Requirements:
Write separate methods for different mathematical operations
Server should identify the requested operation
Invalid commands should generate an appropriate message
Server should support multiple client

/*///////////////////////////////////////////////////////////////////////////////////////

/*///////////////////////////////////////////////////////////////////////////////////////

                                        Server

/*///////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.net.*;
import java.util.*;

class LB316
{
    public static void main(String A[])
    {
        try
        {
            ServerSocket serversocket = new ServerSocket(5555);

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

            dos.writeUTF("Connected to the Server");

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

                if(parts.length != 2)
                {
                    dos.writeUTF("Invalid command format");
                    continue;
                }

                int Num = Integer.parseInt(parts[1]);

                if(operation.equals("EVEN"))
                {
                    if((Num % 2) == 0)
                    {
                        dos.writeUTF(Num+" is a Even Number");
                    }
                    else
                    {
                        dos.writeUTF(Num+" is not a Even Number");
                    }
                }
                else if(operation.equals("ODD"))
                {
                    if((Num % 2) != 0)
                    {
                        dos.writeUTF(Num+" is a Odd Number");
                    }
                    else
                    {
                        dos.writeUTF(Num+" is not a Odd Number");
                    }
                }
                else if(operation.equals("PRIME"))
                {
                    if(Num <= 1)
                    {
                        dos.writeUTF(Num+" is not a Prime Number");
                    }
                    else if(Num == 2)
                    {
                        dos.writeUTF(Num+" is a Prime Number");
                    }
                    else if(Num % 2 != 0)
                    {
                        dos.writeUTF(Num+" is a Prime Number");
                    }
                    else
                    {
                        dos.writeUTF(Num+" is not a Prime Number");
                    }
                }
                else if(operation.equals("PERFECT"))
                {
                    int Sum = 0;

                    for(int i = 1; i < Num; i++)
                    {
                        if((Num % i) == 0)
                        {
                            Sum = Sum + i;
                        }
                    }
                    if(Num == Sum)
                    {
                        dos.writeUTF(Num+" is a Perfect Number");
                    }
                    else
                    {
                        dos.writeUTF(Num+" is not a Perfect Number");
                    }
                }
                else if(operation.equals("FACTORIAL"))
                {
                    int Sum = 1;

                    for(int i = 1; i <= Num; i++)
                    {
                        Sum = Sum * i; 
                    }
                    
                    dos.writeUTF("Factorial is "+Sum);
                }
                else if(operation.equals("REVERSE"))
                {
                    int Sum = 0;
                    int Digit = 0;

                    while(Num != 0)
                    {
                        Digit = Num % 10;

                        Sum = (Sum * 10) + Digit;

                        Num = Num / 10; 
                    }
                    
                    dos.writeUTF("Reverse is "+Sum);
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

