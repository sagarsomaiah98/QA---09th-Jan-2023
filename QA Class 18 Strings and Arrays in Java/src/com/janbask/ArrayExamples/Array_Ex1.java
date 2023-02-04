package com.janbask.ArrayExamples;

public class Array_Ex1 {

	public static void main(String[] args) {
		
		String colors[] = new String[20];
		
		colors[0]="Red";
		colors[1]="blue";
		colors[2]="white";
		colors[3]="green";
		colors[4]="yellow";
		colors[5]="black";
		colors[6]="Brown";
		colors[7]="black";
		
	
        int len= colors.length; 
        
       // System.out.println(len);
		
		for(int i=0;i<len;i++) 
		{
			System.out.println(colors[i]);
			
		}
		

	}

}
