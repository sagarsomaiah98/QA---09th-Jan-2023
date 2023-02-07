package Parameters;

public class Emp {
	
	public void convert(String name) {
		
		System.out.println(name.toUpperCase());
		
		
	}
	

	public static void main(String[] args) {
		
		Emp e = new Emp();
		
		e.convert("henry");
		e.convert("peTer");
		e.convert("jAck");
		

	}

}
