package Static_KeyWords;

public class Student {
	 int marks=50;
	static String name="Kevin";
	
	
	public static void stud_info() {
		char grade='C';
		
		System.out.println("Calling stud_info"
				+ " inside Student class");
		
		System.out.println("Grade "+grade);
			
	}
	public  void display() {
		
		System.out.println("calling display"
				+ " method inside Student class");
	}
	
	public static void main(String[] args) {
		stud_info();

	}

}
