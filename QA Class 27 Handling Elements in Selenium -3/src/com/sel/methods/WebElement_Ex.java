package com.sel.methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Ex {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
	WebElement username=	driver.findElement(By.xpath("//input[@id='user-name']"));
	username.sendKeys("standard_user");
	WebElement password=	driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("secret_sauce");
	WebElement login=	driver.findElement(By.xpath("//input[@id='login-button']"));
	login.click();
		

	}

}
