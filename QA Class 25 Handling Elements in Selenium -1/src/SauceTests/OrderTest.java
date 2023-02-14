package SauceTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Wayne");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("2134");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		String msg=driver.findElement(By.xpath("(//div[@class='complete-text'])[1]")).getText();
		System.out.println(msg);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
