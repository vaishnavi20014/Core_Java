package com.corejava_program;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int no=2;
         int f=1;
		for(int i=1;i<=no;i++){
			if(no%i==0) 
			{
				f=0;
				break;
			}
		}
		if(f==0)
			System.out.println(" Not prime ");
		else
			System.out.println(" prime ");
			
		}
}


