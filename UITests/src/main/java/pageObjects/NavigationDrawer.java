package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class NavigationDrawer 
{
	public NavigationDrawer(AppiumDriver driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSXCUITFindBy(accessibility = "receipt wallet button")
	@AndroidFindBy(accessibility = "receipt wallet button")
	private WebElement receiptWalletButton;
	public WebElement getReceiptWalletButton() 
	{
		return receiptWalletButton;		
	}	
	
	@iOSXCUITFindBy(accessibility = "notifications button")
	@AndroidFindBy(accessibility = "notifications button")
	private WebElement notificationsButton;
	public WebElement getNotificationsButton() 
	{
		return notificationsButton;		
	}	
	
	@iOSXCUITFindBy(accessibility = "my profile button")
	@AndroidFindBy(accessibility = "my profile button")
	private WebElement myProfileButton;
	public WebElement getMyProfileButton() 
	{
		return myProfileButton;		
	}
	
	@iOSXCUITFindBy(accessibility = "current claims button")
	@AndroidFindBy(accessibility = "current claims button")
	private WebElement currentClaimsButton;
	public WebElement getCurrentClaimsButton() 
	{
		return currentClaimsButton;		
	}	
	
	@iOSXCUITFindBy(accessibility = "submitted claims button")
	@AndroidFindBy(accessibility = "submitted claims button")
	private WebElement submittedClaimsButton;
	public WebElement getSubmittedClaimsButton() 
	{
		return submittedClaimsButton;		
	}
	
	@iOSXCUITFindBy(accessibility = "approved claims button")
	@AndroidFindBy(accessibility = "approved claims button")
	private WebElement approvedClaimsButton;
	public WebElement getApprovedClaimsButton() 
	{
		return approvedClaimsButton;		
	}
	
	@iOSXCUITFindBy(accessibility = "gps mileage button")
	@AndroidFindBy(accessibility = "gps mileage button")
	private WebElement gPSMileageButton;
	public WebElement getGPSMileageButton() 
	{
		return gPSMileageButton;		
	}	
	
	@iOSXCUITFindBy(accessibility = "check and pay button")
	@AndroidFindBy(accessibility = "check and pay button")
	private WebElement checkAndPayButton;
	public WebElement getCheckAndPayButton() 
	{
		return checkAndPayButton;		
	}	
	
	@iOSXCUITFindBy(accessibility = "delegate sign-in button")
	@AndroidFindBy(accessibility = "delegate sign-in button")
	private WebElement delegateSignInButton;
	public WebElement getDelegateSignInButton() 
	{
		return delegateSignInButton;		
	}	
	
	@iOSXCUITFindBy(accessibility = "email-in button")
	@AndroidFindBy(accessibility = "email-in button")
	private WebElement emailInButton;
	public WebElement getEmailInButton() 
	{
		return emailInButton;		
	}	
	
	@iOSXCUITFindBy(accessibility = "settings button")
	@AndroidFindBy(accessibility = "settings button")
	private WebElement settingsButton;
	public WebElement getSettingsButton() 
	{
		return settingsButton;		
	}	
	
	@iOSXCUITFindBy(accessibility = "sign out button")
	@AndroidFindBy(accessibility = "sign out button")
	private WebElement signOutButton;
	public WebElement getSignOutButton() 
	{
		return signOutButton;		
	}	
	
}
