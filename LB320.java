// LB Assignment 65 (61)

/*///////////////////////////////////////////////////////////////////////////////////////

2 . Extend the existing client server application by implementing commands that provide 
information about the server

Implement :
DATE 
TIME 
SERVERNAME
HELP
QUIT

Requirements:
HELP should display all commands supported by the server
Quit shold terminate the connection with the current client without terminating the server

/*///////////////////////////////////////////////////////////////////////////////////////

/*///////////////////////////////////////////////////////////////////////////////////////

                                        Server

/*///////////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.net.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

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

                if(operation.equals("QUIT"))
                {
                    dos.writeUTF("Disconnected from Server");
                    break;
                }
                else if(operation.equals("HELP"))
                {
                    String response = "";
                    response = response + "+---------------------------------------------------+\n";
                    response = response + "DATE\n";
                    response = response + "TIME\n";
                    response = response + "SERVERNAME\n";
                    response = response + "HELP\n";
                    response = response + "QUIT\n";
                    
                    response = response + "+---------------------------------------------------+\n";


                    dos.writeUTF(response);
                }
                else if(operation.equals("DATE"))
                {
                    LocalDate currentDate = LocalDate.now();
                    DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    
                    String formattedDate = currentDate.format(form);
                    dos.writeUTF(formattedDate);
                }
                else if(operation.equals("TIME"))
                {
                    LocalTime currentTime = LocalTime.now();
                    DateTimeFormatter form = DateTimeFormatter.ofPattern("HH:mm:ss");
                    
                    String formattedTime = currentTime.format(form);
                    dos.writeUTF(formattedTime);
                }
                else if(operation.equals("SERVERNAME"))
                {
                    InetAddress localHost = InetAddress.getLocalHost();
                    String serverName = localHost.getHostName();
                    dos.writeUTF(serverName);
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