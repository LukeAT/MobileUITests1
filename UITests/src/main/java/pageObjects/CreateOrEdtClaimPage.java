package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CreateOrEdtClaimPage 
{
	public CreateOrEdtClaimPage(AppiumDriver driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@iOSXCUITFindBy(accessibility = "claim create or save button")
	@AndroidFindBy(accessibility = "claim create or save button")
	private WebElement createOrSaveButton;
	public WebElement getCreateOrSaveButton() 
	{
		return createOrSaveButton;
	}
	
	@iOSXCUITFindBy(accessibility = "claim name field")
	@AndroidFindBy(accessibility = "claim name field")
	private WebElement claimNameField;
	public WebElement getClaimNameField() 
	{
		return claimNameField;
	}

}
