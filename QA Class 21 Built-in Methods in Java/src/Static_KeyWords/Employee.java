package Static_KeyWords;

public class Employee {
	static String name="Steve";
	static double height=6.2;
	static char grade ='A';
	static int salary=4000;
	
// accessmodifer returnType function/method name	
	
	public static  void display() {
		
		System.out.println("display");
		
	}
	
	public static  void info() {
		
		System.out.println("info");
	}

	public static void main(String[] args) {
	
	    display();
	    info();
	    System.out.println(name);
	    System.out.println(height);
	    System.out.println(grade);
	    System.out.println(salary);
		
     
	}

}
