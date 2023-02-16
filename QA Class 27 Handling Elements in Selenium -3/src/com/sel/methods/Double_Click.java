package com.sel.methods;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		WebElement button=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		Actions action = new Actions(driver);
		action.doubleClick(button).build().perform();
		
		
	
		
		
		

	}

}
