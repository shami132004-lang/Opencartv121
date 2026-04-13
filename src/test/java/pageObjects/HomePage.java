package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver)
	{
		
		super(driver);
		
	}
	
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkmyaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnlregister;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement linkLogin;
	
	public void clickMyAccount()
	{
		lnkmyaccount.click();
	} 
	
	public void clickRegister()
	{
		lnlregister.click();
	}
	
	public void clickLogin()
	{
	     linkLogin.click();
	}
}
