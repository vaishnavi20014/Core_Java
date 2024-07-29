package com.corejava_program;
class A{
	public void Display() {
		System.out.println("Hello Display Method");
		
	}
	
	public static void Dis() {
		System.out.println("Hello Static Dis Method");
	}
}
public class Method_ex {
	
	public static void show() {
		System.out.println("Hello StaticShow Method");

	}
	public static void main(String args[]) {
		A.Dis();
		show();
		A x=new A();
		x.Display();
	}

}
