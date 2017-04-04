package AppiumTestNG.AppiumSkeleton;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AppTest{
	
	@SuppressWarnings({ "rawtypes", "deprecation" })
	@Test
	public void testApp() throws MalformedURLException, InterruptedException{	
	File appDir = new File("ApkFile");	   
    File app = new File(appDir, "com.creditkarma.mobile_2017-03-17.apk");

    	DesiredCapabilities cap=new DesiredCapabilities();
    	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
    	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
    	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "300");
    	cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
    	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap );
    	WebDriverWait wait = new WebDriverWait(driver, 120);
    	System.out.println(driver.getContext());
    	
    	/*wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.passportparking.mobile:id/countrySpinner")));
    	driver.findElement(By.id("com.passportparking.mobile:id/countrySpinner")).click();
    	@SuppressWarnings("unchecked")
		List<MobileElement>drpDwnList= (List<MobileElement>)driver.findElements(By.id("com.passportparking.mobile:id/spinnerDropDownRow"));
    	System.out.println(drpDwnList.size());
    	for(MobileElement ele:drpDwnList){
    		if (ele.getAttribute("text").equalsIgnoreCase("India")){
    			ele.click(); 
    			break;
    		}
    		
    	}
    	
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Button")));
    	driver.findElement(By.className("android.widget.Button")).click();
    	
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.passportparking.mobile:id/logInButton")));
    	driver.findElement(By.id("com.passportparking.mobile:id/logInButton")).click();
    	
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.passportparking.mobile:id/btnOk")));
    	driver.findElement(By.id("com.passportparking.mobile:id/btnOk")).click();
    	
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.passportparking.mobile:id/emailButton")));
    	driver.findElement(By.id("com.passportparking.mobile:id/emailButton")).click();
    	
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.passportparking.mobile:id/emailTextBox")));
    	//try {
    		driver.findElement(By.id("com.passportparking.mobile:id/emailTextBox")).click();  
    	   //  new ProcessBuilder(new String[]{"adb", "-s", "emulator-5554", "shell", "input", "text", "prithviraj394@yahoo.com"})
    	    //   .redirectErrorStream(true)
    	      // .start();
    	    // Thread.sleep(3000);
    	//} catch (IOException e) {
    	  // System.out.println(e.getStackTrace());
    	//}
    	     
    	driver.findElement(By.id("com.passportparking.mobile:id/emailTextBox")).sendKeys("passport.testingdemo@gmail.com");
           
    	driver.findElement(By.id("com.passportparking.mobile:id/callMeButton")).click(); 	
    	
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.passportparking.mobile:id/btnOk")));
    	//driver.findElement((By.id("com.passportparking.mobile:id/btnOk")))
    	
    	
    	MobileElement demoEle=(MobileElement)driver.findElement((By.id("com.passportparking.mobile:id/btnOk")));
     	demoEle.tap(1, 1);
     	
     	
     	//System.out.println(driver.);
     	
     	//Set contextNames = driver.getContextHandles();
     	//System.out.println(contextNames.size());
*/     	
     	
     	  	    	
	}
	
}
