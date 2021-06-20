package expensesMobile.UITests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.AppBar;
import pageObjects.GPSMileagePage;
import pageObjects.NavigationBar;
import pageObjects.SavedJourneysPage;
import pageObjects.SignInPage;
import pageObjects.Alerts;

public class GPSMileageTest extends DriverWithCapabilities
{
	
	
	@Test
	public void createJourneyWithButtons() throws IOException, InterruptedException
    {
		AndroidDriver<AndroidElement> driver = capabilities("ExpensesMobileApp");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        Utilities utilities = new Utilities();
		utilities.signIn(driver);
		
		AppBar appBar = new AppBar(driver);
		appBar.getOpenMainMenuButton().click();
		
		NavigationBar navBar = new NavigationBar(driver);
		navBar.getGPSMileageButton().click();
		
		Alerts alert = new Alerts(driver);
		alert.getLocationAlertButtonAllow().click();
        
        GPSMileagePage gPSMileagePage = new GPSMileagePage(driver);
        gPSMileagePage.getStartJourneyButton().click();
        snackBars.getDismissSnackBarButton().click();
        gPSMileagePage.getAddStopJourneyButton().click();
        snackBars.getDismissSnackBarButton().click();
        gPSMileagePage.getFinishJourneyButton().click();

        alert.getFinishJourneyAlertButtonFinish().click();
        
        SavedJourneysPage savedJourneysPage = new SavedJourneysPage(driver);
        String postCode = savedJourneysPage.getSavedJourneyPostCode().getText();
        
        assert(postCode != null);
    }
}
