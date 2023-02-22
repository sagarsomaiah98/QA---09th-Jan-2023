package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testBase.TestBase;

public class LogOutPage extends TestBase{
	
	public WebElement menu=driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
	public WebElement logout=driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
	
	
	public void logout() {
		
		menu.click();
		logout.click();
	}

}
