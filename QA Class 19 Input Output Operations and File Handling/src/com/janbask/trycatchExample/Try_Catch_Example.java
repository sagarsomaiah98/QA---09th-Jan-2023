package com.janbask.trycatchExample;
public class Try_Catch_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
    String[] stud = new String[3];
		
		stud[0]="mark";
		stud[1]="steve";
		stud[2]="john";
		
       try {
		System.out.println(stud[4]);
		
       }
       catch(Exception e1) {
    	   e1.printStackTrace();
    	   System.out.println("cannot fetch the values at index 4");
       }
	
	
		
		System.out.println(stud[1]);
	}

}
