package com.corejava_program;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="shelke";
		String rev="";
		
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			rev = ch+rev;
			System.out.println("Character is "+ ch);
			System.out.println("Reverse is "+ rev);
		}

	}

}
