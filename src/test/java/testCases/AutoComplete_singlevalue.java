package testCases;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AutoComplete_PageObject;
import pageObjects.HomePage_PageObject;
import pageObjects.LoginPage_PageObject;
import testBase.BaseClass;

public class AutoComplete_singlevalue extends BaseClass {
	@Test
	public void login() throws InterruptedException
	{
		LoginPage_PageObject loginpg=new LoginPage_PageObject(driver);
		
		loginpg.enterEmail("training@jalaacademy.com");
		
		loginpg.enterPassword("jobprogram");
		
		loginpg.signInClick();
		Thread.sleep(2000);
		
		HomePage_PageObject homepg=new HomePage_PageObject(driver);
		
		String ActualTitle=homepg.displaymagnus();
         Assert.assertEquals(ActualTitle, "Magnus");
         
         
}
	
	
	@Test(dependsOnMethods = { "login" })
		public void autosinglevalue() throws InterruptedException
	{
		Thread.sleep(2000);
        HomePage_PageObject hmpg=new HomePage_PageObject(driver);
        hmpg.clickmore();
        Thread.sleep(1000);
        
        hmpg.clickAutoComplete();
        
        AutoComplete_PageObject autosingle=new AutoComplete_PageObject(driver);
        
        autosingle.clickonSingleValueTag("Action");
        
        List<WebElement> dpdownsinglevalues = driver.findElements(By.xpath("//ul[@id='ui-id-1']//div[@class='ui-menu-item-wrapper']"));
       
        for ( WebElement option : dpdownsinglevalues )
        {
        	  if (option.getText().equalsIgnoreCase("ActionScript"))
        	  {  
        	     option.click();
        	     break;
        	   }
        }
        Thread.sleep(2000);
        
        long timestamp = System.currentTimeMillis(); // Get timestamp for unique filename
  		TakesScreenshot screenshot= (TakesScreenshot)driver;
  		File screenshotFile=screenshot.getScreenshotAs(OutputType.FILE);
  		try {
  	        FileUtils.copyFile(screenshotFile, new File("Screenshots/AutoCompleteSingleValue" + timestamp + ".png"));
  	    } catch (IOException e) {
  	        e.printStackTrace();
  	    }
		
	}
	
}

