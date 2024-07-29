package com.corejava_program;
 class add{
	 public static int addition(int a, int b) {
		 return a+b;
	 }
 }

public class Addition_method {

	public static void main(String[] args) {
		System.out.println("Addition is "+add.addition(10, 50));
		
		int Answer=add.addition(15, 20);
		System.out.println("Addition is "+ Answer);

	}

}
