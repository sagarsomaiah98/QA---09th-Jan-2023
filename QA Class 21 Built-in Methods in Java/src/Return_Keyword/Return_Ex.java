package Return_Keyword;

public class Return_Ex {
	
	
	public int add() {
		
		int a=200;
		int b=100;
		int c=a+b;
		//System.out.println(c);
		
		return b;
	
	}

	public static void main(String[] args) {
	
		Return_Ex r = new Return_Ex();
	    int res= r.add();
	    
	    System.out.println(res);
	    
 		 
	}

}
