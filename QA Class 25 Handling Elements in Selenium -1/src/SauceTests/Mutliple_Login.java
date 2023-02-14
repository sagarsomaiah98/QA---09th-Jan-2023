package SauceTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mutliple_Login {
	
	public void login(String uname,String pwd) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		try {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		System.out.println("LOGGED IN SUCCESSFULLY");
		}
		catch(Exception e) {
			
			System.out.println("FAILED TO LOGIN");
		}
		
		Thread.sleep(1000);
		//driver.close();
		driver.quit();

	}

	public static void main(String[] args) throws InterruptedException {
		
		Mutliple_Login mul= new Mutliple_Login();
		mul.login("standard_user","secret_sauce");
		mul.login("locked_out_user","secret_sauce");
		mul.login("problem_user","secret_sauce");
		mul.login("performance_glitch_user","secret_sauce");
	}

}
