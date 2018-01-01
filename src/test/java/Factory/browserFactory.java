package Factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class browserFactory {

	static WebDriver driver;
	
	public static WebDriver getBrowser(String Browsername)
	{
		if(Browsername.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		else
			if(Browsername.equalsIgnoreCase("chrome"))
			{ 
				
				System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().getChromepath()); //
				driver=new ChromeDriver();
				
			}
//		if(Browsername.equalsIgnoreCase("IE"))
//		{ 
//			
//			System.setProperty("webdriver.ie.driver", DataProviderFactory.getConfig().getApplicationURL()); //
//			driver=new ChromeDriver();
//			
//		}	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void closebrowser(WebDriver ldriver)
	{
		ldriver.close();
		
	}
}
