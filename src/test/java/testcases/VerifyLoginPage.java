package testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Factory.DataProviderFactory;
import Factory.browserFactory;
import pages.HomePage;
import pages.loginPage;


public class VerifyLoginPage {
WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		driver=browserFactory.getBrowser("chrome");
		driver.get(DataProviderFactory.getConfig().getApplicationURL());
		
		
	}
	
	@Test
	public void login()
	{
		HomePage home=PageFactory.initElements(driver, HomePage.class);
		String title=home.getApplicaionTitle();
		Assert.assertTrue(title.contains("Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
		home.clickonSignIn();
		
		loginPage login=PageFactory.initElements(driver, loginPage.class);
		
		//login.loginapplication("ajinkyahiwale@yahoo.com", "Sy@1506");
		
		login.loginapplication(DataProviderFactory.getExcel().getData(0, 0, 0),DataProviderFactory.getExcel().getData(0, 0, 1));
		
		login.mousehover();
		login.signoutlink();
		
		
	}
	

	
	@AfterMethod
	public void close()
	{
		
		browserFactory.closebrowser(driver);
	
	
}}
