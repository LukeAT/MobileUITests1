package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class QuickSignInPage {

	public QuickSignInPage(AppiumDriver driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(accessibility = "set up pin button")
	@AndroidFindBy(accessibility = "set up pin button")
	private WebElement setUpPinButton;
	public WebElement getSetUpPinButton() 
	{
		return setUpPinButton;		
	}
	
	@iOSXCUITFindBy(accessibility = "try quick set up later button")
	@AndroidFindBy(accessibility = "try quick set up later button")
	private WebElement tryQuickSetUpLaterButton;
	public WebElement getTryQuickSetUpLaterButton() 
	{
		return tryQuickSetUpLaterButton;		
	}
	
	@iOSXCUITFindBy(accessibility = "continue button")
	@AndroidFindBy(accessibility = "continue button")
	private WebElement continueButton;
	public WebElement getContinueButton() 
	{
		return continueButton;		
	}
	
}
