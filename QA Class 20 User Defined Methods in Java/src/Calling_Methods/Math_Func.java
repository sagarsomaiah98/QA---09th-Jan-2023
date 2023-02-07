package Calling_Methods;

public class Math_Func {
	
	
public void addition() {//no arguments
		
		int a =40;
		int b=50;
		int c=a+b;
		System.out.println("Addition of two numbers "+a+" and "+b+" is "+c);
	}
	
	
public void  subtraction(){
	   
	   int j=10;
	   int k=2;
	   int l=j-k;
	   
	   System.out.println("Subtraction of two numbers "+l);
   }


	public static void main(String[] args) {
		
		Math_Func ad=new Math_Func();
		ad.addition();
		ad.subtraction();
		ad.addition();
		ad.addition();
		ad.subtraction();
		

	}

}
