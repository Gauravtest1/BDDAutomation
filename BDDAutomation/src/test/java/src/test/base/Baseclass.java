package src.test.base;



import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Baseclass {
	public WebDriver driver;
	
	public WebDriver initiatebrowser () 
	{
		
		ResourceBundle conf= ResourceBundle.getBundle("config");
		if(conf.getString("Browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(conf.getString("Browser").equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if(conf.getString("Browser").equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "./Driver/Internetexplorerdriver.exe");
			driver= new InternetExplorerDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver= new ChromeDriver();
		}
		driver.get(conf.getString("URL"));
		return driver;
	}
	public void closebrowser(WebDriver driver)
	{
		driver.close();
	}
}
