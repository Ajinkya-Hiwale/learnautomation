package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	public static String capturescreenshot(WebDriver driver,String Screenshotname) 
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String destination="C:\\Users\\Ajinkya\\eclipse-workspace\\com.learnautomation.hybrid\\Screenshots"+Screenshotname+System.currentTimeMillis()+".png";
		
		try {
			FileUtils.copyFile(src, new File(destination));
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error is "+e.getMessage());
		}
		
		return destination;
	}
}
