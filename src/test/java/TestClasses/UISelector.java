package TestClasses;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class UISelector{
	
	protected static AndroidDriver driver;
	protected DesiredCapabilities cap;
	protected File appDir;
	protected File app;
	protected WebDriverWait wait ;
	
  @BeforeMethod
  public void setup() throws IOException, InterruptedException{
	  Runtime.getRuntime().exec("cmd /c start C:\\Users\\Prithviraj\\workspace\\AppiumSkeleton\\KickStartAppium.bat");
	  Thread.sleep(10000);
     	appDir= new File("ApkFile");	   
     	app = new File(appDir, "ApiDemos-debug.apk");	 
	 	cap=new DesiredCapabilities();
	 	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
	 	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
	 	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "300");
	 	cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	 	driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap );
		wait = new WebDriverWait(driver, 120);
  }
	
  @SuppressWarnings("deprecation")
@Test
  public void testSteps() {
	  
	  driver.findElementByAndroidUIAutomator("new UiSelector().text(\"App\")").click();
	  
	  MobileElement mobileDriver =(MobileElement) driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Action Bar\")");
	  mobileDriver.swipe(SwipeElementDirection.UP, 35000);
	  
	  driver.findElementByAndroidUIAutomator("new UiSelector().description(\"Text-To-Speech\")").click();
  
	  
  }
  
  @AfterMethod
  public void tearDown() throws IOException{
	  
	  driver.quit();
	  Runtime.getRuntime().exec("cmd /c start C:\\Users\\Prithviraj\\workspace\\AppiumSkeleton\\KillAppium.bat");
	  
  }
  
  
}
