package testCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AddToCartPage;
import pages.LoginPage;
import testBase.TestBase;
import util.Util;

public class AddToCartTest extends TestBase{
	@BeforeMethod
	public void intial() throws IOException {
		intialization();	
	}
	
	@Test
	public void addtocart() throws IOException {
		
		LoginPage l = new LoginPage();
		l.login("standard_user","secret_sauce");
		
		AddToCartPage a = new AddToCartPage();
		a.addtocart();
		Util.Screenshot();
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}


}
