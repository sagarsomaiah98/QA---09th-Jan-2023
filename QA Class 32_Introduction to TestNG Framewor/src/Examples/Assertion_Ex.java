package Examples;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Assertion_Ex {
	
	@Test
	public void assertExample() {
		String name="John";
		
		assertEquals(name, "Patrick");
		
		
		
		
	}

}
