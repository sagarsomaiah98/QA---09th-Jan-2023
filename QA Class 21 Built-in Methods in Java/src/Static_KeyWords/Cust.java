package Static_KeyWords;

public class Cust {
	int age=20;
	static String name="Bob";
	
	//static method
	
	public static  void cust_info() {
		
		System.out.println("calling cust_info");
	}
	//non static method
	public void cust_salary() {
		
		System.out.println("calling cust_Salary");
	}

	public static void main(String[] args) {
		
		Cust s= new Cust();
	    cust_info();
		s.cust_salary();
		System.out.println(name);
		System.out.println(s.age);
	
	}

}
