package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage_PageObject;
import pageObjects.LoginPage_PageObject;
import pageObjects.cSSPropertiesPage_PageObject;
import testBase.BaseClass;


public class CssProperties_Alerts extends BaseClass {
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
		public void alerts() throws InterruptedException
	{
		Thread.sleep(2000);
	    HomePage_PageObject hmpg=new HomePage_PageObject(driver);
	    hmpg.clickmore();
	    Thread.sleep(1000);
	    hmpg.clickCSSProperties();
	    
	    cSSPropertiesPage_PageObject alerts=new cSSPropertiesPage_PageObject(driver);
	    alerts.clickAlerts();
	    alerts.clickSuccess();
	    Thread.sleep(1000);
	    alerts.Clickinfo();
	    Thread.sleep(1000);
	    alerts.clickWarning();
	    Thread.sleep(1000);
	    alerts.clickdanger();
	    Thread.sleep(1000);
	    long timestamp = System.currentTimeMillis(); // Get timestamp for unique filename
  		TakesScreenshot screenshot= (TakesScreenshot)driver;
  		File screenshotFile=screenshot.getScreenshotAs(OutputType.FILE);
  		try {
  	        FileUtils.copyFile(screenshotFile, new File("Screenshots/CSSProperties_Alerts" + timestamp + ".png"));
  	    } catch (IOException e) {
  	        e.printStackTrace();
  	    }
		
	
}}
