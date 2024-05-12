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
import pageObjects.MultipleTabs_PageObject;
import testBase.BaseClass;

public class MutipleTabs extends BaseClass {
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
         hmpg.clickMultipleTabs();
         
         MultipleTabs_PageObject multitabpg=new MultipleTabs_PageObject(driver);
         multitabpg.clickPlantoSucceed();
         multitabpg.enterTextplanToSucceedTB1("Welcome");
         multitabpg.enterTextplanToSucceedTB2("Plan To Succeed");
         
         Thread.sleep(2000);
         long timestamp = System.currentTimeMillis(); // Get timestamp for unique filename
   		TakesScreenshot screenshot1= (TakesScreenshot)driver;
   		File screenshotFile=screenshot1.getScreenshotAs(OutputType.FILE);
   		try {
   	        FileUtils.copyFile(screenshotFile, new File("Screenshots/PlanToSucceed" + timestamp + ".png"));
   	    } catch (IOException e) {
   	        e.printStackTrace();
   	    }
   		Thread.sleep(2000); 
   		multitabpg.clickunLearning();
   		multitabpg.enterTextunLearningTB3("Welcome");
   		multitabpg.enterTextunLearningTB4("UnLearning");
   		Thread.sleep(2000);
        long timestamp1 = System.currentTimeMillis(); // Get timestamp for unique filename
  		TakesScreenshot screenshot2= (TakesScreenshot)driver;
  		File screenshotFile1=screenshot2.getScreenshotAs(OutputType.FILE);
  		try {
  	        FileUtils.copyFile(screenshotFile1, new File("Screenshots/unLearning" + timestamp1 + ".png"));
  	    } catch (IOException e) {
  	        e.printStackTrace();
  	    }
  		Thread.sleep(2000); 
   		multitabpg.clickwaysOfUnlearning();
   		multitabpg.enterTextwaysOfUnlearningTB5("Welcome");
   		multitabpg.enterTextwaysOfUnlearningTB6("WaysOfUnLearning");
   		Thread.sleep(2000);
        long timestamp2 = System.currentTimeMillis(); // Get timestamp for unique filename
  		TakesScreenshot screenshot3= (TakesScreenshot)driver;
  		File screenshotFile2=screenshot3.getScreenshotAs(OutputType.FILE);
  		try {
  	        FileUtils.copyFile(screenshotFile2, new File("Screenshots/waysOfUnlearning" + timestamp2 + ".png"));
  	    } catch (IOException e) {
  	        e.printStackTrace();
  	    }

}}
