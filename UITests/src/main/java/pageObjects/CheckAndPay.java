package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CheckAndPay 
{
	public CheckAndPay(AppiumDriver driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(accessibility = "approve claim button")
	@AndroidFindBy(accessibility = "approve claim button")
	private WebElement approveClaimButton;
	public WebElement getApproveClaimButton() 
	{
		return approveClaimButton;
	}
	
	@iOSXCUITFindBy(accessibility = "allocate for payment button")
	@AndroidFindBy(accessibility = "allocate for payment button")
	private WebElement allocateForForPaymentButton;
	public WebElement getAllocateForForPaymentButton() 
	{
		return allocateForForPaymentButton;
	}
	
	@iOSXCUITFindBy(accessibility = "list claim name")
	@AndroidFindBy(accessibility = "list claim name")
	private WebElement listClaimName;
	public WebElement getListClaimName() 
	{
		return listClaimName;
	}
	
	@iOSXCUITFindBy(accessibility = "list claimant name")
	@AndroidFindBy(accessibility = "list claimant name")
	private WebElement listClaimantName;
	public WebElement geLlistClaimantName() 
	{
		return listClaimantName;
	}
	
	@iOSXCUITFindBy(accessibility = "list claim date and value")
	@AndroidFindBy(accessibility = "list claim date and value")
	private WebElement listClaimDateAndValue;
	public WebElement getListClaimDateAndValue() 
	{
		return listClaimDateAndValue;
	}
	
}
