package com.selenium.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_filling {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		int random=(int) (Math.random()*10000);
		
		       String username="John"+random;
		
		          driver.get("https://parabank.parasoft.com/parabank/register.htm");
		
		          driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("John");
				  driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Wayne");
				  driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("21 baker street");
				  driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Syndey");
				  driver.findElement(By.xpath(" //input[@id='customer.address.state']")).sendKeys("NSW");
				  driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("2145");
				  driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("041234569");
				  driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("A5698");
				  driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(username);
				  driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("12345"); 
				  driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys( "12345"); 
				  driver.findElement(By.xpath("//input[@value='Register']")).click();
	}

}
