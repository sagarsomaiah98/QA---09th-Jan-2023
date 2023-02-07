package Calling_Methods;

public class Operations {
	
	
	public void addition() {
		
		int a =40;
		int b=50;
		int c=a+b;
		System.out.println("Addition of two numbers "+a+" and "+b+" is "+c);
	}
	
	
	

	public static void main(String[] args) {
		
		// we need to create a object
		
		//syntax to create a object
		// classname object= new classname();
		
		Operations op= new Operations();
		op.addition();
		op.addition();
		op.addition();
		op.addition();
	

	}

}
