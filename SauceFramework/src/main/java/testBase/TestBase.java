package testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	Properties prop;
	FileInputStream fis;
	public static WebDriver driver ;
	
	public void intialization() throws IOException {
		

		 fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\config.properties");
		
		 prop= new Properties();
		prop.load(fis);
		
		String browser=prop.getProperty("Browser");
		String url=prop.getProperty("Url");
		int timeout=Integer.parseInt(prop.getProperty("timeout"));
		
		switch(browser) {
		
		case "CHROME":
	   driver = new ChromeDriver();
		break;
		case "FIREFOX":
		 driver = new FirefoxDriver();
		break;
		case "EDGE":
		 driver = new EdgeDriver();
		break;
		default:
		System.out.println("INVALID BROWSER");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
		driver.get(url);
		
		
			
			
		
			
		}
		
		
	}


