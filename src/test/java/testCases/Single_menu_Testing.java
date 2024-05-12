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
import pageObjects.MenuPage_PageObject;
import testBase.BaseClass;

public class Single_menu_Testing extends BaseClass {
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
         
         Thread.sleep(2000);
         HomePage_PageObject hmpg=new HomePage_PageObject(driver);
         hmpg.clickmore();
         Thread.sleep(1000);
         hmpg.clickMenu();
         
         MenuPage_PageObject menupg=new MenuPage_PageObject(driver);
         menupg.clickSingleMenus();
         Thread.sleep(1000);
         menupg.clickSingleMenu_Testing();
         String ExpectedSingleMenuTextTesting=menupg.clickSingleMenuTesting_Txt();
         Assert.assertEquals("You Have Selected Testing Menu Option.", ExpectedSingleMenuTextTesting);
         Thread.sleep(2000);
         long timestamp = System.currentTimeMillis(); // Get timestamp for unique filename
  		TakesScreenshot screenshot= (TakesScreenshot)driver;
  		File screenshotFile=screenshot.getScreenshotAs(OutputType.FILE);
  		try {
  	        FileUtils.copyFile(screenshotFile, new File("Screenshots/SingleMenu_Testing" + timestamp + ".png"));
  	    } catch (IOException e) {
  	        e.printStackTrace();
  	    }

         
}}
