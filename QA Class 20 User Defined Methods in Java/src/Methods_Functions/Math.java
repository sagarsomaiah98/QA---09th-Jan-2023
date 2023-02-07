package Methods_Functions;

public class Math {
	
	//accessModifier returnType method/function name	
	
	public void addition(int a, int b) // arguments/parameters
	
	{
		     
		      int c=a+b;
		      System.out.println("Addition of two numbers  "+a+" and "+b+" is "+c);	
		
	}
	
	public void subtraction(int j, int k)
	{
		 
	      int m=k-j;
	      System.out.println("Subtaction of two numbers  "+k+" and "+j+" is "+m);
	
	}
	
	public static void main(String[] args) {
		
      //CLASSNAME OBJECT= NEW CLASSNAME();
		
		Math test= new Math();
		test.subtraction(10,20);
		test.subtraction(30,15);
		test.subtraction(60,40);
		test.subtraction(20,36);
		test.subtraction(90,50);
		
  
  
    
  		
		
		
      
		
		
		
	}

}
