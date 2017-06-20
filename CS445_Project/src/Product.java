import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.*;

@SuppressWarnings("serial")
public class Product extends JFrame{


    JLabel title, productName, manufacturer, price, description;
    JTextField  pnameField, manuField, pField, desField;
    JButton addButton, deleteButton;
    ButtonGroup bg;
    String SHOW = "Show";
	
ShoppingCart sc = new ShoppingCart();
	
	protected String ProductName;
	protected String Manufacturer;
	protected String Price;
	protected String Description;
	

	
	public Product() {
		// TODO Auto-generated constructor stub
	
        // TODO Auto-generated constructor stub
        //super("REGISTRATION FORM");
         setSize(500, 600);
         setLayout(null);
         // Calling connect method, this will connect us to database
         //connect();
         // Defining Labels 
         
         title = new JLabel("Products");
         title.setBounds(60, 7, 200, 30);
         
        
         productName = new JLabel("Name of product"); 
         productName.setBounds(30, 85, 100, 30);
        
//         manufacturer = new JLabel("Manufacturer"); 
//         manufacturer.setBounds(30, 125, 100, 30);
//         
//         price = new JLabel("Price of product"); 
//         price.setBounds(30, 165, 165, 30);
//         
//         description = new JLabel("Description"); 
//         description.setBounds(30, 205, 100, 30);
        
        
         // Defining Name field
         pnameField = new JTextField(); 
         pnameField.setBounds(200, 85, 130, 30);        
         
//         manuField = new JTextField(); 
//         manuField.setBounds(200, 125, 130, 30);  
//         
//         pField = new JTextField(); 
//         pField.setBounds(200, 165, 130, 30);  
//        
//         desField = new JTextField(); 
//         desField.setBounds(200, 205, 130, 30);  

         bg = new ButtonGroup(); 
         
         

         // fixing all Label,TextField,RadioButton
         add(title);
         
         add(productName);
         add(pnameField);
         
//         add(manufacturer);
//         add(manuField);
//         
//         add(price);
//         add(pField);
//         
//         add(description);
//         add(desField);
//         
        
         
        

       
   

     

         // Defining add Button
         addButton = new JButton("Show Details");
         addButton.setBounds(30, 250, 180, 25);
         addButton.setEnabled(true);


         // fixing all Buttons
         add(addButton);
        
     


         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
         this.setLocation(dim.width/2-this.getSize().width/2,
                          dim.height/2-this.getSize().height/2);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setResizable(false);
         setVisible(true);
         
         if(addButton.isEnabled()){
			 addButton.addActionListener(new AbstractAction(SHOW){ 
		           public void actionPerformed(ActionEvent e){
		               try{ 
		               //Getting Selected Row No
		               //int r = table.getSelectedRow(); 
		               

		            	   	productDetails();			                     
		               }
		               catch(Exception ex){
		                      System.out.println(ex.getMessage());
		               }
		           }
		       });
         
         }
         
   }
	public String productDetails(){
		
		ProductName = pnameField.getText();
//		Manufacturer = manuField.getText();
//		Price = pField.getText();
//		Description = desField.getText();
//		
		switch (pnameField.getText()) {
		case "Security Camera":
			
			Manufacturer = "Canon";
			Price = "$150";
			Description = "It is the best among all with high security";
			
			
			System.out.println("Product Details:\n");
			System.out.println("Product Name is: " +ProductName);
			System.out.println("Product Manufacturer is: " +Manufacturer);	
			System.out.println("Product Price is: " +Price);	
			System.out.println("Product description is: " +Description);	
			
			new IPCamera();
			new DigitalCamera();
			new AnalogCamera();
			
			break;
			
		case "Accessories":
			
			Manufacturer = "zoobo";
			Price = "$10-$80";
			Description = "Many types of accessories";
			
			System.out.println("Product Details:\n");
			System.out.println("Product Name is: " +ProductName);
			System.out.println("Product Manufacturer is: " +Manufacturer);	
			System.out.println("Product Price is: " +Price);	
			System.out.println("Product description is: " +Description);	
			
			new Accessories();
			
			break;
			
		case "DVR":
			
			Manufacturer = "Vertigo";
			Price = "$180";
			Description = "Audio and Vidro DVRs";
	
	System.out.println("Product Details:\n");
	System.out.println("Product Name is: " +ProductName);
	System.out.println("Product Manufacturer is: " +Manufacturer);	
	System.out.println("Product Price is: " +Price);	
	System.out.println("Product description is: " +Description);	
	
	new Analog();
	new Digital();
	new Hybrid();
	
	break;

		default:
			break;
		}
		
		
		
		

		
return null;
}
	
	
}
