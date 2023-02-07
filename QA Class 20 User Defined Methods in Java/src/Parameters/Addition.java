package Parameters;

public class Addition {
	
public void add(int a , int b) {// arguments or paramaters
		
		
		int c=a+b;
		System.out.println("Addition of two numbers "+a+" and "+b+" is "+c);
	}

public void addthree(int a , int b, int c) {// arguments or paramaters
	
	
	int r=a+b+c;
	System.out.println("Addition of three numbers "+a+" and "+b+" and "+c+" is "+r);
}


	public static void main(String[] args) {
		
		Addition a = new Addition();
		a.add(10,20);
	    a.addthree(600, 20,100);
		a.add(100,200);
		a.addthree(56, 10, 20);
	
		

	}

}
