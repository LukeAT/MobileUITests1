package expensesMobile.UITests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class DriverWithCapabilities {
	
	public static AppiumDriverLocalService service;
	
	public AppiumDriverLocalService startServer() 
	{
		boolean flag = checkIfServerIsRunning(4723);
		if(!flag) 
		{
			service = AppiumDriverLocalService.buildDefaultService();
			service.start();
		}
		return service;
	}
	
	public static boolean checkIfServerIsRunning(int port) 
	{
		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			serverSocket.close();
		}catch (IOException e) {
			isServerRunning = true;
		}finally {
			serverSocket = null;
		}
		
		return isServerRunning;
	}
	
	public static void startEmulator() throws IOException, InterruptedException 
	{
		Runtime.getRuntime().exec(System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\StartEmulator.bat");
		Thread.sleep(10000);
	}
	
	public static AndroidDriver<AndroidElement> capabilities(String appName) throws IOException, InterruptedException {
		
	
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\expensesMobile\\UITests\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		//VSCode build output path.
		//Does not install new if app already on emulator.
		File appLocation = new File("src");
		File mobileApp = new File(appLocation, (String) prop.get(appName));
		String deviceName = prop.getProperty("DeviceName");
		
		//All of the virtual device you use should start with the word 'emulator'.
		if(deviceName.contains("emulator"))
		{
			startEmulator();
		}
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.APP, mobileApp.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		String device = (String) prop.get("DeviceName");
		cap.setCapability("deviceName", device);
		
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		cap.setCapability("appPackage", "com.softwareeurope.expensesmobile");
		cap.setCapability("appActivity", "com.softwareeurope.expensesmobile.MainActivity");
		
		// Is this needed?
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 3600);
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		return driver;
	}
	
	
	
}

