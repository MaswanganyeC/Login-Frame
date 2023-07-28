

package za.ac.tut;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class LoginFramee extends JFrame
{
   private JPanel headerJP;
   private JPanel usernameJP;
   private JPanel PasswordJP;
   private JPanel LoginDetailsJP;
   private JPanel btnsJP;
   private JPanel mainJP;
   
   private JLabel headerLB;
   private JLabel usernameLB;
   private JLabel PasswordLB;
  
   
   private JTextField usernameTXF;
   private JTextField PasswordTXF;
   
   private JButton submit;
   
    public LoginFramee() 
    {
        setLayout(new BorderLayout());
     setSize(250,200);
     setBackground(Color.YELLOW);
     setTitle(" User Login Page");
     
      headerJP = new JPanel (new FlowLayout(FlowLayout.LEADING));
      usernameJP = new JPanel(new FlowLayout(FlowLayout.LEFT));
      PasswordJP = new JPanel(new FlowLayout(FlowLayout.LEFT));
      LoginDetailsJP = new JPanel(new FlowLayout(FlowLayout.CENTER));
      btnsJP = new JPanel(new FlowLayout());
      mainJP = new JPanel(new FlowLayout());
      
        // create Labels
      
      headerLB = new JLabel ("USER LOGIN ");
      usernameLB = new JLabel("Username :");
      PasswordLB = new JLabel("Password :");
      
      // create TextField
      
      usernameTXF = new JTextField(20);
      PasswordTXF = new JTextField(20);
      
      //Create button
      
      submit = new JButton(" Submit ");

        // Add to the panel
      headerJP.add(headerLB);
      usernameJP.add(usernameLB);
      
      PasswordJP.add(PasswordLB);

      usernameJP.add(usernameTXF);
      PasswordJP.add(PasswordTXF);
      
    
      //
      btnsJP.add(submit);

        mainJP.add(usernameJP, BorderLayout.CENTER);
        mainJP.add(PasswordJP, BorderLayout.CENTER);
        mainJP.add(btnsJP, BorderLayout.SOUTH);

        add(headerJP, BorderLayout.NORTH);
        add(mainJP, BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}