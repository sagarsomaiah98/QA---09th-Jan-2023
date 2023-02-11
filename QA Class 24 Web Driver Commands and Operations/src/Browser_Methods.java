import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Methods {

	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		
		d.manage().window().maximize();
		
	//	d.get("https://www.saucedemo.com");
		d.navigate().to("https://www.bing.com");
		d.navigate().back();
		d.navigate().to("https://www.selenium.dev/downloads/");
		d.navigate().forward();
		d.navigate().to("https://www.saucedemo.com");
		d.navigate().refresh();
		

	}

}
