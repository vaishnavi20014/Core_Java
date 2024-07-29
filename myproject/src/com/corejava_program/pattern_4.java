package com.corejava_program;

public class pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int n = 5; // Number of rows
	// Outer loop for number of rows       
	for (int i = 1; i <= n; i++) { 
		// Inner loop for number of columns
		for (int j = 1; j <= i; j++) { 
		  System.out.print("* ");
		  }
		// Move to the next line after each row          
		System.out.println(); 
		        }
	 }
}	
 


