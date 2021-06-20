package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ClaimPage 
{
	
	public ClaimPage(AppiumDriver driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//This is for the empty state page.
	@iOSXCUITFindBy(accessibility = "create claim button")
	@AndroidFindBy(accessibility = "create claim button")
	private WebElement createClaimButton;
	public WebElement getCreateClaimButton() 
	{
		return createClaimButton;
	}
	
	@iOSXCUITFindBy(accessibility = "overflow menu button")
	@AndroidFindBy(accessibility = "overflow menu button")
	private WebElement overflowMenuButton;
	public WebElement getOverflowMenuButton() 
	{
		return overflowMenuButton;
	}
	
	@iOSXCUITFindBy(xpath = "submit button")
	@AndroidFindBy(xpath = "submit button")
	private WebElement submitButton;
	public WebElement getSubmitButton() 
	{
		return submitButton;
	}
	
	@iOSXCUITFindBy(accessibility = "claim value")
	@AndroidFindBy(accessibility = "claim value")
	private WebElement claimValue;
	public WebElement getClaimValue() 
	{
		return claimValue;
	}
	
	@iOSXCUITFindBy(accessibility = "create claim overflow menu button")
	@AndroidFindBy(accessibility = "create claim overflow menu button")
	private WebElement createClaimOverflowMenuButton;
	public WebElement getCreateClaimOverflowMenuButton() 
	{
		return createClaimOverflowMenuButton;
	}
	
	@iOSXCUITFindBy(accessibility = "edit claim overflow menu button")
	@AndroidFindBy(accessibility = "edit claim overflow menu button")
	private WebElement editClaimOverflowMenuButton;
	public WebElement getEditClaimOverflowMenuButton() 
	{
		return editClaimOverflowMenuButton;
	}
	
	@iOSXCUITFindBy(accessibility = "delete claim overflow menu button")
	@AndroidFindBy(accessibility = "delete claim overflow menu button")
	private WebElement deleteClaimOverflowMenuButton;
	public WebElement getDeleteClaimOverflowMenuButton() 
	{
		return deleteClaimOverflowMenuButton;
	}
	
	@iOSXCUITFindBy(accessibility = "delete claim overflow menu button")
	@AndroidFindBy(accessibility = "delete claim overflow menu button")
	private WebElement deleteClaimOverflowMenuButton;
	public WebElement getDeleteClaimOverflowMenuButton() 
	{
		return deleteClaimOverflowMenuButton;
	}
	
	//This is for the submitted claims empty state page.
	@iOSXCUITFindBy(accessibility = "go to current claims button")
	@AndroidFindBy(accessibility = "go to current claims button")
	private WebElement goToCurrentClaimsButton;
	public WebElement getGoToCurrentClaimsButton() 
	{
		return goToCurrentClaimsButton;
	}
		
		
	@iOSXCUITFindBy(xpath = "unsubmit button")
	@AndroidFindBy(xpath = "unsubmit button")
	private WebElement unsubmitButton;
	public WebElement getUnSubmitButton() 
	{
		return unsubmitButton;
	}
	
	@iOSXCUITFindBy(xpath = "expense item subcat")
	@AndroidFindBy(xpath = "expense item subcat")
	private WebElement expenseItemSubcat;
	public WebElement getExpenseItemSubcat() 
	{
		return expenseItemSubcat;
	}
	

}
