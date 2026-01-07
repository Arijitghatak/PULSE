 import java.io.*; // importing network parts of java
 import java.net.*;
 class Server {

    ServerSocket Server; // using through java.net 
    Socket Socket;
    BufferedReader br;
    PrintWriter out;

    //constructor 
    public Server (){
       try {
           Server = new ServerSocket(7777);
           System.out.println("Server is ready to accept connection...");
           System.out.println("Waiting...");
           Socket=Server.accept();

           br = new BufferedReader(new InputStreamReader(Socket.getInputStream()));

           out = new PrintWriter(Socket.getOutputStream());

           startReading ();
           startWriting();

       } catch (Exception e) {
        e.printStackTrace();
       } 
    }

public void startReading(){

}
public void startWriting(){
    
}


    public static void main(String[] args) {
        System.out.println("Server is running...");
        new Server();
    }   
}
