import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ShoppingCart extends Customer{
String[] products = {"DVR", "Accessories", "Security camera"};
		protected int count = 0;
	
	Customer c = new Customer();
		
public ShoppingCart(){
	
	addItem();
	
}
	
public void addItem(){
	 
	//this.count = super.count; 
	count++;
	//System.out.println("product is added");

	

	for(int i = 0; i< 3; i++){
		
	
		
		System.out.println(products[i]);
		
	}
	 
	
	 
 }
 
 public void removeItem(){
	 

	 	// = nameField.getText();
	 
		
		
	 
 }
 }
	

