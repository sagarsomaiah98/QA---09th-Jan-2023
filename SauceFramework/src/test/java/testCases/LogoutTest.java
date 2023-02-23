package testCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LogOutPage;
import pages.LoginPage;
import testBase.TestBase;
import util.Util;

public class LogoutTest extends TestBase {
	@BeforeMethod
	public void intial() throws IOException {
		intialization();	
	}
	
	@Test
	public void logout() throws IOException {
		
		LoginPage l = new LoginPage();
		l.login("standard_user","secret_sauce");
		
		LogOutPage lo= new LogOutPage();
		lo.logout();
		Util.Screenshot();
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}


}
