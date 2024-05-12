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
import pageObjects.SearchEmployee_PageObject;
import testBase.BaseClass;

public class SearchEmployee extends BaseClass {

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
         
         HomePage_PageObject hmpg=new HomePage_PageObject(driver);
         Thread.sleep(2000);
         hmpg.clickEmployee();
         hmpg.clickSearch();
         
         SearchEmployee_PageObject searchemp=new SearchEmployee_PageObject(driver);
         searchemp.EnterName("IHPTKE");
         searchemp.Search_btn();
         
         Thread.sleep(2000);
         long timestamp = System.currentTimeMillis(); // Get timestamp for unique filename
  		TakesScreenshot screenshot= (TakesScreenshot)driver;
  		File screenshotFile=screenshot.getScreenshotAs(OutputType.FILE);
  		try {
  	        FileUtils.copyFile(screenshotFile, new File("Screenshots/SearchEmployee" + timestamp + ".png"));
  	    } catch (IOException e) {
  	        e.printStackTrace();
  	    }
}
}