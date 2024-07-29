package com.corejava_program;

public class pattern3 {
		    public static void main(String[] args) {
		        int rows = 4; // number of rows in the pattern

		        // outer loop to handle number of rows
		        for (int i = 0; i < rows; i++) {
		            // inner loop to handle spaces
		            for (int j = 0; j < i; j++) {
		                System.out.print(" ");
		            }

		            // inner loop to handle stars
		            for (int k = i; k < rows; k++) {
		                System.out.print("*");
		            }

		            // move to the next line
		            System.out.println();
		        }
		    }

	}

