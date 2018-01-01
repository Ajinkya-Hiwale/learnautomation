package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Factory.DataProviderFactory;
import Factory.browserFactory;
import pages.HomePage;

public class Verifyhomepage {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		 driver=browserFactory.getBrowser("chrome");
		driver.get(DataProviderFactory.getConfig().getApplicationURL());
	}
	
	@Test
	public void testHomePage() {
	
	HomePage home=PageFactory.initElements(driver, HomePage.class);
	String title=home.getApplicaionTitle();
	System.out.println("Title is "+title);
	
	
	}
	
	@AfterMethod
	public void close()
	{
		browserFactory.closebrowser(driver);
		
	}
}
