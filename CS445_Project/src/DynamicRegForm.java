

	import javax.swing.*;
	import javax.swing.table.DefaultTableModel; 
	import java.awt.event.*;
	import java.sql.ResultSet;

	@SuppressWarnings("serial")
	public class DynamicRegForm extends Customer{

	      String gender = "";
	      ResultSet rst,rstLast;
	      Object[][] data;
	      int serialNo; 
	      String SHOW = "Show";
	      //RegistrationFormGUI formGUIObject;

	      // Defining Constructor
	      DynamicRegForm(){
	            nameField.addKeyListener(new KeyAdapter() {
	                  public void keyTyped(KeyEvent e) {
	                  if(nameField.getText().length()>=15)
	                        e.consume();
	                  }
	            });
	           
	            addressField.addKeyListener(new KeyAdapter() {
	                  public void keyTyped(KeyEvent e) {
	                  if(addressField.getText().length()>50)
	                        e.consume();
	                  }
	            });
	            contactField.addKeyListener(new KeyAdapter() {
	                  public void keyTyped(KeyEvent e) {
	                        char c = e.getKeyChar();
	                        if (!((c >= '0') && (c <= '9') ||
	                             (c == KeyEvent.VK_BACK_SPACE) ||
	                             (c == KeyEvent.VK_DELETE))) {
	                              // getToolkit().beep();
	                              e.consume();
	                        }
	                        if(contactField.getText().length()>9) 
	                              e.consume();
	                  }
	            });
	           	registerButton.addActionListener(new AbstractAction(SHOW){
	                   public void actionPerformed(ActionEvent ae){
	                         try{
	                            if (ae.getSource() == registerButton) {
	                                if (nameField.getText().equals(""))
	                                   JOptionPane.showMessageDialog(nameField, "Please provide Name_Field");
	                                else if(addressField.getText().equals(""))
	                                   JOptionPane.showMessageDialog(addressField, 
	                                               "Please provide Address_Field");
	                                else if(contactField.getText().equals(""))
	                                   JOptionPane.showMessageDialog(contactField, "Please provide Contact_Field");
	                               
	                                else {
		                                 register();
//	                                 //Fetching column values from Database
//	                                 preStatement.setString(1,nameField.getText());
//	                                 preStatement.setString(2,gender);
//	                                 preStatement.setString(3,addressField.getText());
//	                                 preStatement.setString(4,contactField.getText());
//	                               //Executing MySQL Update Query
//	                                 int i = preStatement.executeUpdate();
//	                                 if(i==1){
//	                                  JOptionPane.showMessageDialog(panel, 
//	                                               "Successfully Registered");
//	                                 }
//	 
//	                                 // showing last row 
//	                                rstLast = stmt.executeQuery("select *from regForm");
//	                                rstLast.last();
//	                                String string = serialNo++ +",                  "+String.valueOf(rstLast.getLong(1))+",       "+rstLast.getString(2)+",   "+rstLast.getString(3)+",   "+rstLast.getString(4)+",       "+rstLast.getString(5);
//	                                 Object[] row = null;
//	                                 row = string.split(",");
//	                                 model.addRow(row);
//	                                 panel.revalidate();
	 
	                                 // fields are blank
	                                 //blankFields();
	                               }
	                              }
	                       }catch(Exception ex){
	                              System.out.println(ex.getMessage()); 
	                       }
	                   }
	            });
	 
	            updateButton.addActionListener(new AbstractAction(SHOW){
	              public void actionPerformed(ActionEvent e){
	                  if (nameField.getText().equals(""))
	                        JOptionPane.showMessageDialog(nameField,
	                                    "Please provide Name_Field");
	                  else if(addressField.getText().equals(""))
	                        JOptionPane.showMessageDialog(addressField,
	                                    "Please provide Address_Field");
	                  else if(contactField.getText().equals(""))
	                        JOptionPane.showMessageDialog(contactField,
	                                    "Please provide Contact_Field");              
	                                
	                  else {
	                              System.out.println("j");
	              }
	              }
	          });
	 
	            //Registering Anonymous Listener Class
	            deleteButton.addActionListener(new AbstractAction(SHOW){ 
	              public void actionPerformed(ActionEvent e){
	                  try{ 
	                  //Getting Selected Row No
	                  //int r = table.getSelectedRow();
	                	  
	                	  deleteProduct();
	                  
	                                    registerButton.setEnabled(true);
	                                    deleteButton.setEnabled(false);
	                                    updateButton.setEnabled(false);
	                              
	                        
	                  }
	                  catch(Exception ex){
	                         System.out.println(ex.getMessage());
	                  }
	              }
	          });
	            
	            //Registering Anonymous Listener Class
	            addButton.addActionListener(new AbstractAction(SHOW){ 
	              public void actionPerformed(ActionEvent e){
	                  try{ 
	                  //Getting Selected Row No
	                  //int r = table.getSelectedRow(); 
	                  
	new Product();       
//new ShoppingCart();	                        
	                  }
	                  catch(Exception ex){
	                         System.out.println(ex.getMessage());
	                  }
	              }
	          });
	 
	            
	            
	            checkOutButton.addActionListener(new AbstractAction(SHOW){ 
		              public void actionPerformed(ActionEvent e){
		                  try{ 
		                  //Getting Selected Row No
		                  //int r = table.getSelectedRow(); 
		                  
		                              checkOut();
		                        
		                  }
		                  catch(Exception ex){
		                         System.out.println(ex.getMessage());
		                  }
		              }
		          });
		 
	            
	      }

//	      // main() method
//	      public static void main(String[] args) {
//	            new DynamicRegForm();
//	      }     
	}
	 
	

