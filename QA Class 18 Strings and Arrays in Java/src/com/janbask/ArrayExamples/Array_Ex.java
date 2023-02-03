package com.janbask.ArrayExamples;

public class Array_Ex {

	public static void main(String[] args) {
		
	
	//DataType arrayName = new DataType[size of array]	
		
		String Students[]= new String[5];
		
		Students[2]="Mark";
		Students[4]="Kevin";
		Students[3]="Sam";
		Students[0]="John";
		Students[1]="Bruce";
		Students[2]="Lee";
		Students[0]="James";
		
		/*
		 * System.out.println(Students[0]); System.out.println(Students[1]);
		 * System.out.println(Students[2]); System.out.println(Students[3]);
		 * System.out.println(Students[4]);
		 */
	
		for(int a=0;a<5;a++) {
			System.out.println(Students[a]);
		}
		

	}

}
