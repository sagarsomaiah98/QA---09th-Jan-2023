package testCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import testBase.TestBase;

public class LoginTest extends TestBase {
	
	@BeforeMethod
	public void intial() throws IOException {
		intialization();	
	}
	
	@Test
	public void login() throws IOException {
		
		
		LoginPage l = new LoginPage();
		l.login("standard_user","secret_sauce");
		
		
	}
	@Test
	public void invalidlogin() throws IOException {
		
		
		LoginPage l = new LoginPage();
		l.login("username1","secret_sauce");
		
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
