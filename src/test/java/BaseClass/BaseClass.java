package BaseClass;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class BaseClass {
	
protected static AndroidDriver driver;
protected DesiredCapabilities cap;
protected File appDir;
protected File app;
protected WebDriverWait wait ;
	

 

  @BeforeSuite
  public void kickStartAppium() throws IOException, InterruptedException{
	  
	  Runtime.getRuntime().exec("cmd /c start C:\\Users\\Prithviraj\\workspace\\AppiumSkeleton\\KickStartAppium.bat");
	  
	  System.out.println("Kickstarted Appium server"); 
	  
	  Thread.sleep(10000);
	  	
			 	
	  }
  
  
  @Parameters("browser")
  @BeforeClass
  public void driversetup() throws MalformedURLException{
	  
	  //System.out.println(browser);
	  
	  appDir= new File("ApkFile");	   
	   app = new File(appDir, "PassportParking Mobile Pay.apk");	 
		 	cap=new DesiredCapabilities();
		 	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		 	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		 	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "300");
		 	cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		 	driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap );
			wait = new WebDriverWait(driver, 120);
		 	//return new 
	  
	  
  }
  
/* @BeforeMethod
 public void initializeDriver() throws MalformedURLException, InterruptedException{
	 
	System.out.println("I'm now in BeforeTest");
    //Thread.sleep(10000);
     
 }*/
 
@AfterClass
	public void resetApp() throws InterruptedException{
	 
	 System.out.println("I'm in AfterClass");
	 
	 	//driver.resetApp();
		driver.quit();
		
		//Thread.sleep(10000);
		
}

@AfterSuite
public void tearDownAppium() throws InterruptedException, IOException{
		 
		Runtime.getRuntime().exec("cmd /c start C:\\Users\\Prithviraj\\workspace\\AppiumSkeleton\\KillAppium.bat");
				
		}
}
