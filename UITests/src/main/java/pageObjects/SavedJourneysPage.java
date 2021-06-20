package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SavedJourneysPage 
{
	public SavedJourneysPage(AppiumDriver driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(accessibility = "saved journey post codes")
	@AndroidFindBy(accessibility = "saved journey post codes")
	private WebElement savedJourneyPostCodes;
	public WebElement getSavedJourneyPostCodes() 
	{
		return savedJourneyPostCodes;		
	}
	
}