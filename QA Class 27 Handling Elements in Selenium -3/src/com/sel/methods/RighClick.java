package com.sel.methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RighClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		WebElement rightbutton=driver.findElement(By.xpath("(//button[normalize-space()='Right Click Me'])[1]"));
		
		Actions action = new Actions(driver);
		action.contextClick(rightbutton).build().perform();
		
	
		
	}

}
