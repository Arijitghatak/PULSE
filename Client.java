 import java.net.*;
 
 class Client {

    Socket socket ;

Public Client (){
    try {
        System.out.println("sending Request to server ");
        socket = new Socket("i27.0.0.1",7777);


    } catch (Exception e) {
        printStackTrace();
    }
}

    public static void main(String[] args) {
        System.out.println("(client server is running)");
    }
}
