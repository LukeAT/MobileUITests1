package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Alerts 
{
	public Alerts(AppiumDriver driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(id = "?????")
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	private WebElement locationAlertButtonAllow;
	public WebElement getLocationAlertButtonAllow() 
	{
		return locationAlertButtonAllow;		
	}
	
	@iOSXCUITFindBy(id = "?????")
	@AndroidFindBy(id = "android:id/button1")
	private WebElement finishJourneyAlertButtonFinish;
	public WebElement getFinishJourneyAlertButtonFinish() 
	{
		return finishJourneyAlertButtonFinish;		
	}
}
