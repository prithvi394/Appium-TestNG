package TestClasses;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TestBase {
	
	
	
  @BeforeSuite
  public void beforeSuite(){
	  System.out.println("Before Suite");
	  
  }
  
  @AfterSuite
  public void afterSuite(){
	  System.out.println("After Suite");
	  
  }
  
  @BeforeClass
  public void beforeClass(){
	  System.out.println("After Suite");
	  
  }
  
  
}
