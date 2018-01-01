package Factory;

import dataprovider.ConfigDataProvider;
import dataprovider.ExcelReader;

public class DataProviderFactory {

	public static ConfigDataProvider getConfig() 
	{
		ConfigDataProvider config=new ConfigDataProvider();
		return config;
		
	}
	
	public static ExcelReader getExcel()
	{
		ExcelReader excel=new ExcelReader();
		return excel;
	}
}
 //we are creating this class and returning object so that we do not need to create object of this class again and again