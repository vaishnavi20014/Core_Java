package com.corejava_program;

public class Reverce_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "vaishnavi";
		
		int length= a.length();
		String rev="";
		
		for(int i=length-1;i>=0;i--) {
			rev=rev+a.charAt(i);
			}
	System.out.println("Reverse of vaishnavi is "+rev);	
	}

}
