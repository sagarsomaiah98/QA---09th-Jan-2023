package Examples;

import org.testng.annotations.Test;

public class PriorityEx {

	
		@Test(priority=2)
		public void LoginmethodA() {
			
			System.out.println("calling method login A");
		}
		
		@Test(priority=1)
	public void OrdermethodB() {
			
			System.out.println("calling method order B");
		}
		
		@Test(priority=4)
	public void AddtocartmethodC() {
		
		System.out.println("calling method addtocart C");
	}
		@Test(priority=3)
	public void Checkout() {
		
		System.out.println("calling method checkout  C");
	}
	
		
		
	}


