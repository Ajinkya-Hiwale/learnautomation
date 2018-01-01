package testcases;



import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Factory.DataProviderFactory;
import Factory.browserFactory;
import pages.HomePage;

public class VerifyhomePageExtentReport {
	Calendar calendar;
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest logger;
	
	@BeforeMethod
	public void setUp() {
		calendar=Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("MM_dd_yyyy_hh_mm_ss");//can use any format
		report=new ExtentReports("C:\\Users\\Ajinkya\\eclipse-workspace\\com.learnautomation.hybrid\\Reports\\homepage "+ formater.format(calendar.getTime()) + ".html", false);
		logger=report.startTest("verfifying application");
		 driver=browserFactory.getBrowser("chrome");
		driver.get(DataProviderFactory.getConfig().getApplicationURL());
		logger.log(LogStatus.INFO, "App is up and running");
		
	}
	
	@Test
	public void testHomePage() {
	
	HomePage home=PageFactory.initElements(driver, HomePage.class);
	logger.log(LogStatus.INFO, "intialized elements");
	String title=home.getApplicaionTitle();
	System.out.println("Title is "+title);
	logger.log(LogStatus.PASS,"Got the title succesfully");
	
	
	}
	
	@AfterMethod
	public void close()
	{
		browserFactory.closebrowser(driver);
		report.endTest(logger);
		report.flush();
		
	}
}
