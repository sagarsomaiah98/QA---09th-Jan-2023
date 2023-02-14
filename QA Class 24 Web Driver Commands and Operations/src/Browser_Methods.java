import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d= new ChromeDriver();
		
		d.manage().window().maximize();
		
	//	d.get("https://www.saucedemo.com");
		d.navigate().to("https://www.bing.com");
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(2000);
		d.navigate().to("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		d.navigate().forward();
		Thread.sleep(2000);
		d.navigate().to("https://www.saucedemo.com");
		Thread.sleep(2000);
		d.navigate().refresh();
		

	}

}
