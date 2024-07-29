package com.corejava_program;

public class Noincreasing_reversepyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=6;
for(int i=1;i<=t;i++) {
	for(int k=t;k>=i;k--) {
		 
		System.out.print("*");
	}
	System.out.println();
}
	}

}
