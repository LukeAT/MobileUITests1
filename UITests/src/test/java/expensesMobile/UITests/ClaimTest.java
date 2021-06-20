package expensesMobile.UITests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.AppBar;
import pageObjects.CheckAndPay;
import pageObjects.CreateOrEdtClaimPage;
import pageObjects.ClaimPage;
import pageObjects.DeclarationPage;
import pageObjects.NavigationDrawer;
import pageObjects.SubmittedClaimsPage;

public class ClaimTest extends DriverWithCapabilities
{
	@Test
	public void createClaimTest() throws IOException, InterruptedException
    {
		//service = startServer(); this is giving a 'main appium script does not exist at...' error
		
        AndroidDriver<AndroidElement> driver = capabilities("ExpensesMobileApp");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        Utilities utilities = new Utilities();
        AppBar appBar = new AppBar(driver);
        NavigationDrawer navBar = new NavigationDrawer(driver);
        ClaimPage claimPage = new ClaimPage(driver);
        CreateOrEdtClaimPage createClaimsPage = new CreateOrEdtClaimPage(driver);
        
        utilities.signIn(driver);
        appBar.getMainMenuButton().click();
        navBar.getCurrentClaimsButton().click();
        claimPage.getCreateClaimButton().click();
        createClaimsPage.getCreateOrSaveButton().click();
        
        assert (claimPage.getClaimValue().isDisplayed() == true);
        
        //service.stop();
    }
	
	@Test
	public void submitClaimTest() throws IOException, InterruptedException 
	{
		AndroidDriver<AndroidElement> driver = capabilities("ExpensesMobileApp");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        Utilities utilities = new Utilities();
        AppBar appBar = new AppBar(driver);
        NavigationDrawer navBar = new NavigationDrawer(driver);
        ClaimPage claimPage = new ClaimPage(driver);
        DeclarationPage declarationPage = new DeclarationPage(driver);
        
        utilities.signIn(driver);
        appBar.getMainMenuButton().click();
        navBar.getCurrentClaimsButton().click();
        claimPage.getSubmitButton().click();
        declarationPage.getAcceptDeclarationButton().click();
        
        assert (claimPage.getCreateClaimButton().isDisplayed());
	}
	
	@Test 
	public void unsubmitClaimTest() throws IOException, InterruptedException 
	{
		AndroidDriver<AndroidElement> driver = capabilities("ExpensesMobileApp");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        Utilities utilities = new Utilities();
        AppBar appBar = new AppBar(driver);
        NavigationDrawer navBar = new NavigationDrawer(driver);
        ClaimPage claimsPage = new ClaimPage(driver);
        
        utilities.signIn(driver);
        appBar.getMainMenuButton().click();
        navBar.getSubmittedClaimsButton().click();
        claimsPage.getUnSubmitButton().click();
        
        assert(claimsPage.getGoToCurrentClaimsButton().isDisplayed());
	}
	
	@Test 
	public void approveClaimTest() throws IOException, InterruptedException 
	{
		
		
		AndroidDriver<AndroidElement> driver = capabilities("ExpensesMobileApp");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        Utilities utilities = new Utilities();
        AppBar appBar = new AppBar(driver);
        NavigationDrawer navBar = new NavigationDrawer(driver);
        CheckAndPay checkAndPay = new CheckAndPay(driver);
        DeclarationPage declarationPage = new DeclarationPage(driver);
        
        utilities.signIn(driver);
        appBar.getMainMenuButton().click();
        navBar.getCheckAndPayButton().click();
        checkAndPay.getApproveClaimButton().click();
        declarationPage.getAcceptDeclarationButton().click();
        
        assert(checkAndPay.getAllocateForForPaymentButton().isDisplayed());
        
	}
	
	@Test 
	public void approveExpenseTest() throws IOException, InterruptedException 
	{
		AndroidDriver<AndroidElement> driver = capabilities("ExpensesMobileApp");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        Utilities utilities = new Utilities();
        AppBar appBar = new AppBar(driver);
        NavigationDrawer navBar = new NavigationDrawer(driver);
        CheckAndPay checkAndPay = new CheckAndPay(driver);
        
        utilities.signIn(driver);
        appBar.getMainMenuButton().click();
        navBar.getCheckAndPayButton().click();
        

        
	}
	
	@Test 
	public void editExpenseAsApproverTest() throws IOException, InterruptedException 
	{
		AndroidDriver<AndroidElement> driver = capabilities("ExpensesMobileApp");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        Utilities utilities = new Utilities();
        AppBar appBar = new AppBar(driver);
        NavigationDrawer navBar = new NavigationDrawer(driver);
        
        utilities.signIn(driver);
        appBar.getMainMenuButton().click();
        navBar.getCheckAndPayButton().click();
        
	}

}
