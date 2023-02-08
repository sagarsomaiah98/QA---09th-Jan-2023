package Static_KeyWords;

public class Test {
	
	

	public static void main(String[] args) {
		
	Student s = new Student();
	s.display();
	System.out.println(s.marks);
	System.out.println(s.name);
	
	
	Stud s1 = new Stud();
	s1.display();
	System.out.println(s1.marks);
//static method or static variable when called from other class use
	//classname.staticmethor for methods
	//classname.staticvariables for variables
	
	
	Student.stud_info();
	System.out.println(Stud.name);	
		
	}

}
