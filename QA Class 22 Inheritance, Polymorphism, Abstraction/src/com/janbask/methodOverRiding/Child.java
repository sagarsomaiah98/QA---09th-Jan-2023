package com.janbask.methodOverRiding;
public class Child extends Parent {
	
	String name="Bruce";
	public void method2() {
		
		System.out.println("Child modifying method 2");
		
	}
	


		
	public void method3() {
		System.out.println(" child method 3");
		
	}
	
	public void method4() {
		
		System.out.println("child method 4");
	}
	

	public static void main(String[] args) {
		
		Child c= new Child();
		c.method1();
		c.method2();
		c.method3();
		c.method4();
		System.out.println(c.name);
		
		
	

	}

}
