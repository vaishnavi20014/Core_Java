package com.corejava_program;
class V{
	public void display() {
		System.out.println("Created the class 1");
	}
	
	public static void display1(){
		System.out.println("created the class 2");
	}
	
	
     public class Class_Example {
    	 public void show() {
    		 System.out.println("This is static method");
    	 }

	public void main(String[] args) {
		show();
		  V.display1();
	

	       V x = new V();
	       x.display();
	}}}
		
		




