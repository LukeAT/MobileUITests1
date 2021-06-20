package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SnackBars 
{
	public SnackBars(AppiumDriver driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(id = "?????")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='DISMISS']")
	private WebElement dismissSnackBarButton;
	public WebElement getDismissSnackBarButton() 
	{
		return dismissSnackBarButton;		
	}

}
