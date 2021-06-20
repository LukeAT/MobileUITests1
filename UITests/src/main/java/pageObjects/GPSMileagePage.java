package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class GPSMileagePage 
{
	public GPSMileagePage(AppiumDriver driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(accessibility = "start button")
	@AndroidFindBy(accessibility = "start button")
	private WebElement startJourneyButton;
	public WebElement getStartJourneyButton() 
	{
		return startJourneyButton;		
	}
	
	@iOSXCUITFindBy(accessibility = "add stop button")
	@AndroidFindBy(accessibility = "add stop button")
	private WebElement addStopJourneyButton;
	public WebElement getAddStopJourneyButton() 
	{
		return addStopJourneyButton;		
	}
	
	@iOSXCUITFindBy(accessibility = "finish button")
	@AndroidFindBy(accessibility = "finish button")
	private WebElement finishJourneyButton;
	public WebElement getFinishJourneyButton() 
	{
		return finishJourneyButton;		
	}
}
