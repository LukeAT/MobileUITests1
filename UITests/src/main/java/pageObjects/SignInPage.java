package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SignInPage 
{

	public SignInPage(AppiumDriver driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(accessibility = "company id field")
	@AndroidFindBy(accessibility = "company id field")
	private WebElement companyIDField;
	public WebElement getCompanyIDField() 
	{
		return companyIDField;		
	}
	
	@iOSXCUITFindBy(accessibility = "username field")
	@AndroidFindBy(accessibility = "username field")
	private WebElement usernameField;
	public WebElement getUsernameField() 
	{
		return usernameField;		
	}
	
	@iOSXCUITFindBy(accessibility = "enter password field")
	@AndroidFindBy(accessibility = "enter password field")
	private WebElement passwordField;
	public WebElement getPasswordField() 
	{
		return passwordField;		
	}
	
	@iOSXCUITFindBy(accessibility = "sign in button")
	@AndroidFindBy(accessibility = "sign in button")
	private WebElement signInButton;
	public WebElement getSignInButton() 
	{
		return signInButton;		
	}
	
	@iOSXCUITFindBy(accessibility = "forgotten details button")
	@AndroidFindBy(accessibility = "forgotten details button")
	private WebElement forgottenDetailsButton;
	public WebElement getForgottenDetailsButton() 
	{
		return forgottenDetailsButton;		
	}
	
	
}


