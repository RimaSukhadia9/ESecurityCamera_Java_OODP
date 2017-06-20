import javax.swing.*;


import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")

public class User extends JFrame implements ActionListener {
	
	private static final String SHOW = null;
	JButton SUBMIT;
	  JPanel panel;
	  JLabel label1,label2;
	  //Customer c = new Customer();
	  
	  final JTextField  text1,text2;
	   User()
	   {
	   label1 = new JLabel();
	   label1.setText("Username:");
	   text1 = new JTextField(15);
	 
	   label2 = new JLabel();
	   label2.setText("Password:");
	   text2 = new JPasswordField(15);
	  
	   SUBMIT=new JButton("SUBMIT");
	   
	   panel=new JPanel(new GridLayout(3,1));
	   panel.add(label1);
	   panel.add(text1);
	   panel.add(label2);
	   panel.add(text2);
	   panel.add(SUBMIT);
	   add(panel,BorderLayout.CENTER);
	   SUBMIT.addActionListener(this);
	   setTitle("LOGIN FORM");
	   }
	  public void actionPerformed(ActionEvent ae)
	   {
	   String value1=text1.getText();
	   String value2=text2.getText();
	   if (value1.equals("1") && value2.equals("1")) {
		//   new Customer();
		   DynamicRegForm drf = new DynamicRegForm();
		  
		   		try{
		   			
		   			
		   			
		   			if(drf.addButton.isEnabled()){
		   				 drf.addButton.addActionListener(new AbstractAction(SHOW){ 
		   			           public void actionPerformed(ActionEvent e){
		   			               try{ 
		   			               //Getting Selected Row No
		   			               //int r = table.getSelectedRow(); 
		   			            	               
		   //new Product();
		   new ShoppingCart();			               }
		   			               catch(Exception ex){
		   			                      System.out.println(ex.getMessage());
		   			               }
		   			           }
		   			       });
		   			}
		   				 else{
		   					 
		   					 System.out.println("e");
		   				 }
		   		//new DynamicRegForm();
		   		//new Product();
		   		//User user = new User();
		   		//user.setVisible(true);
		   		//user.setSize(300,100);
		   		
		   		}
		   		
		   		 catch(Exception e)
		   	    {
		   	    	
		   			 JOptionPane.showMessageDialog(null, e.getMessage());
		   	    
		   	    }
		   		
		   	
		   		
		   		
		   	
		   	}
	   	//new DynamicRegForm();
	   //page.setVisible(true);
	  // JLabel label = new JLabel(page);
	   //page.getContentPane().add(label);
	   
	  else{
		  
		  System.out.println("Content not available");
		  
		  
	  
	   }
	   }

}

