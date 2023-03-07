
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LOGIN implements ActionListener{
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    public static void main(String[] args) {
        JPanel panel=new JPanel();  
        JFrame frame=new JFrame();
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        frame.setTitle("CashApp");
        frame.add(panel,BorderLayout.CENTER);

        panel.setLayout(null);
        
        userLabel=new JLabel("Client name");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        button=new JButton("Login");
        button.setBounds(10, 80, 80, 40);
        button.addActionListener(new LOGIN());
        panel.add(button);

        JButton button1=new JButton("Sign in");
        button1.setBounds(10, 85, 85, 25);
        panel.add(button);



        JTextField userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel success = new JLabel();
        success.setBounds(10,100,300, 25);
        panel.add(success);
      
    }

    public void actionPerformed(ActionEvent e) {
        String username = userText.getText();
        String password = passwordText.getText(); 
        System.out.println (username+","+password); 
    }
}