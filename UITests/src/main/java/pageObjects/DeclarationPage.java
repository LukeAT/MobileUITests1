package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class DeclarationPage 
{
	public DeclarationPage(AppiumDriver driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@iOSXCUITFindBy(accessibility = "accept declaration button")
	@AndroidFindBy(accessibility = "accept declaration button")
	private WebElement acceptDeclarationButton;
	public WebElement getAcceptDeclarationButton() 
	{
		return acceptDeclarationButton;
	}
	
	@iOSXCUITFindBy(accessibility = "decline declaration button")
	@AndroidFindBy(accessibility = "decline declaration button")
	private WebElement declineDeclarationButton;
	public WebElement getDeclineDeclarationButton() 
	{
		return declineDeclarationButton;
	}
}
