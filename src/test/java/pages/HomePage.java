package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver ldriver)
	{
		this.driver=ldriver;
		
	}
	
	@FindBy(xpath="//span[text()=\"Hello. Sign in\"]")
	WebElement signIn;
	
	@FindBy(xpath="//span[text()=\"Orders\"]")
	WebElement Orders;
	
	@FindBy(xpath="//a[@id=\"nav-link-prime\"]")
	WebElement TryPrime;
	
	@FindBy(xpath="//a[@id='nav-cart']")
	WebElement Cart;
	
	public void clickonSignIn() 
	{
		signIn.click();
	}
	
	public void clickonOrders() 
	{
		Orders.click();
	} 
	public void clickonTryPrime() 
	{
		TryPrime.click();
	} 
	public void clickonCart() 
	{
		Cart.click();
	} 
	
	public String getApplicaionTitle()
	{
		 return driver.getTitle();
	}
}
