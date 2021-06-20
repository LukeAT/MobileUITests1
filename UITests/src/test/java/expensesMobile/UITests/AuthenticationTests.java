package expensesMobile.UITests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.SignInPage;

public class AuthenticationTests extends DriverWithCapabilities{
	

	@Test
	public void setUpPinTest() throws IOException, InterruptedException
    {
		//service = startServer(); this is giving a 'main appium script does not exist at...' error
		
        AndroidDriver<AndroidElement> driver = capabilities("ExpensesMobileApp");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        SignInPage signInPage = new SignInPage(driver);
        
        signInPage.getCompanyIDField().sendKeys("ex_mobile");
        signInPage.getUsernameField().sendKeys("Luket_admin");
        signInPage.getPasswordField().sendKeys("test6");
        
        
        
        signInPage.getSignInButton().click();
        
        //service.stop();
    }
	
}
