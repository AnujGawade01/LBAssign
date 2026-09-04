// LB Assignment 67 (63)

/*///////////////////////////////////////////////////////////////////////////////////////

4 . Develop a client server application where the client can check whether a particular
file exists on the server machine

The client should send :
EXISTS <filename>

Requirements :
 The file checking operation must be performed by the server, not the client

/*///////////////////////////////////////////////////////////////////////////////////////

/*///////////////////////////////////////////////////////////////////////////////////////


                                        Server


/*///////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;
import java.net.*;

class LB331
{
    public static void main(String A[])
    {

        try 
        {
            ServerSocket serversocket = new ServerSocket(9090);

            System.out.println("----------------------------------");
            System.out.println("--------- Server Started ---------");
            System.out.println("----------------------------------");

            while(true)
            {
                System.out.println("Server is waiting for client request");

                Socket clientsocket = serversocket.accept();

                System.out.println("Client connected successfully");

                Thread t  = new Thread(() -> HandleClientRequest(clientsocket));

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

            dos.writeUTF("Connected to the server");

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

                String filename = parts[1];

                if(operation.equals("EXISTS"))
                {
                    File fobj = new File(filename);

                    if(fobj.exists())
                    {
                        dos.writeUTF(filename+" exists on server");
                    }
                    else
                    {
                        dos.writeUTF(filename+" does not exist");
                    }
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