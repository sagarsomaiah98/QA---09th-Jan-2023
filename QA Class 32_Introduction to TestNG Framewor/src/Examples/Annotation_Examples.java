package Examples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Examples {
	
	@Test
	public void methodA() {
		
		System.out.println("calling method A");
	}
	@Test
public void methodB() {
		
		System.out.println("calling method B");
	}
	@Test
public void methodC() {
	
	System.out.println("calling method C");
}
	
	@BeforeMethod
	public void Launchbefore() {
		
		System.out.println("*********  calling before method **********");
	}
	
	@AfterMethod
	public void closeafter() {
		
		System.out.println("*********  calling after method **********");
	}
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("*********  calling before Test **********");
	}
	
	@AfterTest
	public void close() {
		
		System.out.println("*********  calling after Test **********");
	}

}
