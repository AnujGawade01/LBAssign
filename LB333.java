// LB Assignment 67 (63)

/*///////////////////////////////////////////////////////////////////////////////////////

5 . Develop a client server application where the client can request information about a
file stored on the server

The client should send command :

    INFO <filename>

The server should return :

    File Name       : ____
    Size            : ____ 
    Readable        : ____
    Writable        : ____
    Absolute Path   : ____

Requirements    :

 Handle non existent files appropriately

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

                if(operation.equals("INFO"))
                {
                    File fobj = new File(filename);

                    if(fobj.exists())
                    {
                        String fileinfo = "";
                        fileinfo = fileinfo +"File Name     : "+fobj.getName()+"\n";
                        fileinfo = fileinfo +"Size          : "+fobj.length()+" bytes\n";
                        fileinfo = fileinfo +"Readable      : "+fobj.canRead()+"\n";
                        fileinfo = fileinfo +"Writable      : "+fobj.canWrite()+"\n";
                        fileinfo = fileinfo +"Absolute path : "+fobj.getAbsolutePath()+"\n";
                        
                        dos.writeUTF(fileinfo);
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