package Methods_Functions;

import External_Calling.Operations;

public class Employee{
	
	String name="John";
	int age=30;
	
	public void info() {
		
		System.out.println("calling info method");
	}
	
	

	public static void main(String[] args) {
		
	Employee emp= new Employee();
	emp.info();
	
	System.out.println(emp.name);
	System.out.println(emp.age);
		

	}

}
