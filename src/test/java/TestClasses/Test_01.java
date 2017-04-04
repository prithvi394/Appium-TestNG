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
import io.appium.java_client.functions.ExpectedCondition;

public class Test_01 extends BaseClass {
	
 /* @BeforeClass
  public void declareDriver() throws MalformedURLException{
	  
	  classDeclaration();
	  
	  
  }*/
	
	
  @Test
  public void testSteps() {
	  
	  System.out.println("Test 1a");
	  
	  System.out.println(driver.getContext());
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Button")));
	  
	  driver.findElement(By.className("android.widget.Button")).click();
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.passportparking.mobile:id/signUpButton")));
	  /*wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bt.bms:id/btnLogin")));	  
	  driver.findElement(By.id("com.bt.bms:id/btnLogin")).click();	  
	  driver.findElement(By.id("com.bt.bms:id/signUp")).click();
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.EditText")));
	  
	  List<WebElement>elems=driver.findElements(By.className("android.widget.EditText"));
	  elems.get(0).sendKeys("Prithviraj");
	  elems.get(1).sendKeys("Gangadharaiah");
	  elems.get(3).sendKeys("prithvi394@gmail.com");*/
	  
	  
  
	 // driver.getCurrentUrl();
	  //System.out.println(contextNames.size());
	  
  }
  
  
  @Test
  public void testSteps2() {
	  
	  System.out.println("Test 1b");
	  
	  System.out.println(driver.getContext());
	  
	  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.passportparking.mobile:id/spinnerDropDownRow")));
	  
	 // @SuppressWarnings("unchecked")
	//List<WebElement> elem=driver.findElements(By.id("com.passportparking.mobile:id/spinnerDropDownRow"));
	  
	  //elem.get(7).click();
	
  }
  
}
