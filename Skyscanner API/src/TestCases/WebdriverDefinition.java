package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverDefinition {
public static WebDriver driver = null;
	
	public WebdriverDefinition () {
		if (driver == null)
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			System.out.println("**Chrome driver initiated**");
		}
		else
		{
		System.out.println("**Chrome driver already instantiated**");
		}
		}
		public static WebDriver getdriver()
		{
			if (driver == null){
				return driver;
				}else{
				return driver;
				}
		}
		}
