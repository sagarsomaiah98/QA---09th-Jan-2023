package com.selenium.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx {

	public static void main(String[] args) throws InterruptedException {
		//shortcut also do the imports altogether is press ctrl+shift+o
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='first']")));
		
		sel.selectByValue("Google");
		Thread.sleep(2000);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		sel.selectByVisibleText("Iphone");
		
		

	}

}
