package TestClasses;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.functions.ExpectedCondition;

public class MobileGestures extends BaseClass {
	
/*	  @BeforeClass
	  public void declareDriver() throws MalformedURLException{
		  
		  classDeclaration();
		  
		  
	  }*/
	
  //@SuppressWarnings("unchecked")
@Test
  public void testSteps2 () {
	  
	  System.out.println("Test 2a");
	  
	  System.out.println(driver.getContext());
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Button")));
	  
	  driver.findElement(By.className("android.widget.Button")).click();
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.passportparking.mobile:id/signUpButton")));
	  
	  /*wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/btnNoThanks")));
	  
	  driver.findElement(By.id("com.bt.bms:id/btnNoThanks")).click();
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/dismiss")));
	  
	  driver.findElement(By.id("com.bt.bms:id/dismiss")).click();*/
	  
	  //List<MobileElement> elem=(List<MobileElement>)driver.findElements(By.id("com.bt.bms:id/ctxv_region_name"));
	  //elem.get(0).swipe(SwipeElementDirection.UP, 8000);
	  
	  
	  
  }

@Test
public void testSteps2b () {
	  
	  System.out.println("Test 2b");
	  
	  System.out.println(driver.getContext());
	  

	  
	 // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.passportparking.mobile:id/spinnerDropDownRow")));
	  
	/*  @SuppressWarnings("unchecked")
	List<WebElement> elem=driver.findElements(By.id("com.passportparking.mobile:id/spinnerDropDownRow"));
	  
	  elem.get(6).click();*/
	  
 }


}