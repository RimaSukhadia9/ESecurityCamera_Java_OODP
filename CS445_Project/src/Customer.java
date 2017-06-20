import java.awt.Color; 
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class Customer extends JFrame{

    JLabel title, nameLabel, addressLabel, contactLabel, cityLabel, countryLabel, stateLabel, emailLabel, zipLabel;
    JTextField  nameField, addressField, contactField, cityField, stateField, countryField, zipField, emailField;
    JButton registerButton, addButton,updateButton,deleteButton, checkOutButton;
    ButtonGroup bg;
    String SHOW = "Show";

    //for database
    Connection con;
    Statement stmt;
    PreparedStatement preStatement,updatePreStmt;

    
	int count=0;
    public Customer() {
    	

    	
        // TODO Auto-generated constructor stub
        super("REGISTRATION FORM");
   
         setSize(500, 600);
         setLayout(null);
         // Calling connect method, this will connect us to database
         //connect();
         // Defining Labels 
         title = new JLabel("Registration Form");
         title.setBounds(60, 7, 200, 30);
        
         nameLabel = new JLabel("Name"); 
         nameLabel.setBounds(30, 85, 60, 30);
        
         addressLabel = new JLabel("Address"); 
         addressLabel.setBounds(30, 125, 60, 30); 
        
         contactLabel = new JLabel("Contact"); 
         contactLabel.setBounds(30, 165, 60, 30);
         
         cityLabel = new JLabel("City"); 
         cityLabel.setBounds(30, 205, 60, 30);
         
         stateLabel = new JLabel("State"); 
         stateLabel.setBounds(30, 245, 60, 30);
         
         countryLabel = new JLabel("Country"); 
         countryLabel.setBounds(30, 285, 60, 30);
         
         zipLabel = new JLabel("ZipCode"); 
         zipLabel.setBounds(30, 325, 60, 30);
         
         emailLabel = new JLabel("email-id"); 
         emailLabel.setBounds(30, 365, 60, 30);

        
         // Defining Name field
         nameField = new JTextField(); 
         nameField.setBounds(95, 85, 130, 30);         
        

         bg = new ButtonGroup(); 
         
         addressField = new JTextField(); 
         addressField.setBounds(95, 125, 130, 30);
         
         contactField = new JTextField(); 
         contactField.setBounds(95, 165, 130, 30);
         
         cityField = new JTextField(); 
         cityField.setBounds(95, 205, 130, 30);
         
         stateField = new JTextField(); 
         stateField.setBounds(95, 245, 130, 30); 
         
         countryField = new JTextField(); 
         countryField.setBounds(95, 285, 130, 30); 
         
         zipField = new JTextField(); 
         zipField.setBounds(95, 325, 130, 30); 
         
         emailField = new JTextField(); 
         emailField.setBounds(95, 365, 130, 30); 

         // fixing all Label,TextField,RadioButton
         add(title);
         add(nameLabel);
         add(addressLabel);
         add(contactLabel);
         add(nameField);
         add(addressField);
         add(contactField);
         add(countryLabel);
         add(countryField);
         add(stateLabel);
         add(stateField);
         add(emailLabel);
         add(emailField);
         add(zipLabel);
         add(zipField);
         add(cityLabel);
         add(cityField);

       
         // Defining Register Button
         registerButton = new JButton("Register");
         registerButton.setBounds(30, 400, 100, 25);

         // Defining Update Button
         updateButton = new JButton("Update");
         updateButton.setBounds(135, 400, 100, 25);
         updateButton.setEnabled(true);

         // Defining Delete Button
         deleteButton = new JButton("Delete");
         deleteButton.setBounds(135, 430, 100, 25);
         deleteButton.setEnabled(true);

         // Defining add Button
         addButton = new JButton("Add");
         addButton.setBounds(30, 430, 100, 25);
         addButton.setEnabled(true);

         // Defining checkOutButton
         checkOutButton = new JButton("Check out");
         checkOutButton.setBounds(60, 460, 100, 25);
         checkOutButton.setEnabled(true);


         // fixing all Buttons
         add(addButton);
         add(checkOutButton);
         add(registerButton);
         add(updateButton);
         add(deleteButton);


         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
         this.setLocation(dim.width/2-this.getSize().width/2,
                          dim.height/2-this.getSize().height/2);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setResizable(false);
         setVisible(true);
         
         //Registering Anonymous Listener Class
         
   }

    public void checkOut(){
    	
    	System.out.println("Checking out product/s");
    	
    }
    
    public void register(){
    	
    	System.out.println("User registered successfully");
    	
    }
    
    public void addProduct(){
    	
    	
    	count++;
    	System.out.println("product is added");
    	

    	
    }
    
 
    public void deleteProduct(){
    	count--;
    	
    	System.out.println("product is deleted");

    	
    }
    
    // Connection with Database
    public void connect(){
          try{
                Class.forName("com.mysql.jdbc.Driver");
                con =DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/test","root","1234");
                stmt = con.createStatement();
                preStatement = con.prepareStatement("insert into regForm( name,gender,address,contact) values(?,?,?,?)");
          }catch(Exception e){
                System.out.print(e.getMessage());
          }
    }
}
    


