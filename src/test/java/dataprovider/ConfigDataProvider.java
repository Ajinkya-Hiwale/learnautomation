package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties prop;
	
	public ConfigDataProvider()
	{
		File src=new File("./Configurations/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			  prop=new Properties();
			  
				prop.load(fis);
			
			
			  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("exception is"+e.getMessage());
		}
		
	}
	
	public String getApplicationURL() 
	{
		
		String url=prop.getProperty("url");
		return url;
	}
		
	public String getChromepath() 
	{
		
		String br=prop.getProperty("chrome");
		return br;
		
	}
}
