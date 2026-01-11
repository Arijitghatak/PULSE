package Client;

public class Main {
    public static void main(String[] args) {
        
        Gui gui = new Gui();
        Client client = new Client(gui);
        gui.setClient(client);
        gui.start();
    
}
}