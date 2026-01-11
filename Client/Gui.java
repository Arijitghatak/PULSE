package Client;

import java.awt.*; // buttons,text fields,frames
import javax.swing.*; // spacing withot boxes
import javax.swing.border.EmptyBorder;   // layout,colors,fonts



public class Gui {
    
    //screen parts 

    private JFrame frame;
    private JTextArea ChatArea;
    private JTextField inputField;
    private JButton sendButton;
    private Client client ;

    // constructor for start build ui and networking the object
    public Gui(){
        createUI();
    }

    public void setClient(Client client ){
        this.client= client;
    }

    // shows the window when the app starts 
    public void start(){
        frame.setVisible(true);
    }


   

private void createUI(){

    // create the window 

    frame = new JFrame("PULSE"); //title
    frame.setSize(500,650); //size
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close behaviour
    frame.setLocationRelativeTo(null); // centers to screen


    // create dark layout

    JPanel root = new JPanel(new BorderLayout());
    root.setBackground(new Color(18,18,18));
    root.setBorder(new EmptyBorder(10,10,10,10));


    // add logo 
    ImageIcon icon = new ImageIcon(
        getClass().getResource("/Client/logo.png")
    );
    Image img = icon.getImage().getScaledInstance(80,80,Image.SCALE_SMOOTH );
    icon = new ImageIcon(img);

    JLabel title = new JLabel (icon,SwingConstants.CENTER);
    title.setBorder(new EmptyBorder(10,0,15,0));


    // chat area

    ChatArea = new JTextArea();
    ChatArea.setEditable(false);
    ChatArea.setBackground(new Color(30,30,30));
    ChatArea.setForeground((Color.white));
    ChatArea.setFont(new Font("consolas",Font.PLAIN,14));
    ChatArea.setLineWrap(true);
    ChatArea.setWrapStyleWord(true);

    JScrollPane scroll = new JScrollPane(ChatArea);
    scroll.setBorder(null);


    // input panel 

    JPanel inputPanel = new JPanel(new BorderLayout(10,10));
    inputPanel.setBackground(new Color(40,40,40));
    inputPanel.setBorder(new EmptyBorder(10,0,0,0));

    inputField = new JTextField();
    inputField.setBackground(new Color (40,40,40));
    inputField.setForeground(Color.white);
    inputField.setCaretColor(Color.white);
    inputField.setBorder(new EmptyBorder(10,10,10,10));
    inputField.setFont(new Font ("Segoe UI",Font.PLAIN,14));


    // add send button 

    ImageIcon SendIcon = new ImageIcon(
        getClass().getResource("/Client/pulsesend.png")
    );

    Image sendImg = SendIcon.getImage().getScaledInstance(32,32 ,Image.SCALE_SMOOTH);
    SendIcon = new ImageIcon(sendImg);

    sendButton = new JButton(SendIcon);
    sendButton.setBackground(new Color(70,130,180));
    sendButton.setFocusPainted(false);
    sendButton.setBorderPainted(false);
    sendButton.setOpaque(true);
    sendButton.setCursor(new Cursor(Cursor.HAND_CURSOR));


    // layout 

    inputPanel.add(inputField,BorderLayout.CENTER);
    inputPanel.add(sendButton,BorderLayout.EAST);

    root.add(title,BorderLayout.NORTH);
    root.add(scroll,BorderLayout.CENTER);
    root.add(inputPanel,BorderLayout.SOUTH);

    frame.setContentPane(root);

    // button + Enter key Listener 

    sendButton.addActionListener(e -> sendMessage());
    inputField.addActionListener(e -> sendMessage());


    // send message logic 

   
}

 private void sendMessage(){
        String msg = inputField.getText().trim();
        if(!msg.isEmpty()){
            client.sendMessage(msg);
            addMessage("Me: " + msg);
            inputField.setText("");
        }
    }

    public void addMessage(String msg){
        ChatArea.append(msg + "\n");
    }

}