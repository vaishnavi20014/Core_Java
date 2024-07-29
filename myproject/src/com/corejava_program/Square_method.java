package com.corejava_program;
class Sq{
	public static int square(int x){
		return x*x;
	}
}

public class Square_method {

	public static void main(String[] args) {
		System.out.println("Suare is "+ Sq.square(5));

		int Answer=Sq.square(4);
		System.out.println("square is "+ Answer);
	}

}
