package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {

	WebDriver driver;
	public loginPage(WebDriver ldriver)
	
	{
	this.driver=ldriver;	
		
	}

	@FindBy(xpath="//input[@id='ap_email']")
	WebElement username;
	@FindBy(xpath="//span[@id='continue'][@id='continue']")
	WebElement next;
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement login;
	By signout=By.xpath("//*[@id=\"nav-item-signout\"]/span");
	
	public void loginapplication(String user,String Pass)
	{
		
		username.sendKeys(user);
		next.click();
		password.sendKeys(Pass);
		login.click();
		
	}
	
	public void mousehover()
	{
		
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]"));
		act.moveToElement(ele).build().perform();
	}
	public void signoutlink()
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement ele=wait.until(ExpectedConditions.presenceOfElementLocated(signout));
		//String text=ele.getText();
		//Assert.assertTrue(text.contains("Sign Out"));
		ele.click();
		
		
		
	}
}
