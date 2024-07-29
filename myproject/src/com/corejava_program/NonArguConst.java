package com.corejava_program;

public class NonArguConst {
	//declaration
	String firstname;
	String lastname;
	int a;
	
	//Initialization
	NonArguConst(){
		firstname="vaishnavi";
		lastname="shelke";
		a =24;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonArguConst b= new NonArguConst();
		System.out.println("My name: "+b.firstname);
		System.out.println("My surname: "+b.lastname);
		System.out.println("My age: "+b.a);

	}

}
