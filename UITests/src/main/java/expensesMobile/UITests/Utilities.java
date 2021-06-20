package expensesMobile.UITests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.QuickSignInPage;
import pageObjects.SignInPage;

public class Utilities extends DriverWithCapabilities
{
	public void signIn(AppiumDriver driver) throws IOException, InterruptedException 
	{
		//AndroidDriver<AndroidElement> driver = capabilities("ExpensesMobileApp");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        SignInPage signInPage = new SignInPage(driver);
        signInPage.getCompanyIDField().sendKeys("ex_mobile");
        signInPage.getUsernameField().sendKeys("Luket_admin");
        signInPage.getPasswordField().sendKeys("test6");
        signInPage.getSignInButton().click();
        
        QuickSignInPage quickSignInPage = new QuickSignInPage(driver);
        quickSignInPage.getTryQuickSetUpLaterButton().click();
	}
	
	public void dismissSnackBar(AppiumDriver driver)
	{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        	
	}
	
    public void scrollToText(String text)
    {
        // SomeCommonMethod you use all the time.
    }
}
