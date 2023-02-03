package com.janbask.ArrayExamples;

public class Studen_Array {

	public static void main(String[] args) {
		
		
		String[]  Student=new String[9];
		
		Student[0]="PAUL";
		Student[1]="KEVIN";
		Student[2]="JAMES";
		Student[3]="JOE";
		Student[4]="CHRIS";
		Student[5]="SOM";
		Student[6]="LUCY";
		Student[8]="MARK";
		
		/*
		 * System.out.println(Student[0]);
		 *  System.out.println(Student[1]);
		 * System.out.println(Student[2]); 
		 * System.out.println(Student[3]);
		 * System.out.println(Student[4]); 
		 * System.out.println(Student[5]);
		 * System.out.println(Student[6]);
		 */
	//	System.out.println(Student.length);
		
		for(int i=0;i<Student.length;i++) {
			
			System.out.println(Student[i]);
			
			
		}
		
		
		
		
		
		
		

	}

}
