package com.selenium.Elements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Win_Handling {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://login.salesforce.com/?locale=in");
	driver.findElement(By.linkText("Privacy")).click();
	Thread.sleep(2000);
	
	
	Set<String> win= driver.getWindowHandles();
	
	Iterator<String> it =win.iterator();
	
	String parent=it.next();
	String child= it.next();
	System.out.println(parent);
    System.out.println(child);
	
	
	System.out.println(win.size());
	
	driver.switchTo().window(child);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='Our Story']")).click();
	
	driver.quit();
		

	}

}
