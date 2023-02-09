package com.janbask.methodOverloading;

public class Multiplication {
	//same method name but different arguments is called method overloading
	
	public void mult() {
		
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println("Multiplication of two numbers "+a+" and "+b+" is "+c);
	}

	public void mult(int a) {
		
		System.out.println("calling multiplication int method");
	}
	public void mult(double h) {
		
		System.out.println("calling multiplication double method");
	}
		public void mult(String k) {
			
			System.out.println("calling multiplication string method");
		}
	
	public static void main(String[] args) {
		Multiplication m = new Multiplication();
		m.mult("john");

	}

}
