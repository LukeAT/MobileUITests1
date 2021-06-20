package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AppBar 
{
	
	public AppBar(AppiumDriver driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(accessibility = "main menu button")
	@AndroidFindBy(accessibility = "main menu button")
	private WebElement mainMenuButton;
	public WebElement getMainMenuButton() 
	{
		return mainMenuButton;
	}
	
	@iOSXCUITFindBy(accessibility = "overflow menu button")
	@AndroidFindBy(accessibility = "overflow menu button")
	private WebElement overflowMenuButton;
	public WebElement getOverflowMenuButton() 
	{
		return overflowMenuButton;
	}

}