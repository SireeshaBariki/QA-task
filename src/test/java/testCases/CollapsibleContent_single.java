package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CollapsibleContent_PageObject;
import pageObjects.HomePage_PageObject;
import pageObjects.LoginPage_PageObject;
import testBase.BaseClass;

public class CollapsibleContent_single extends BaseClass {
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
		public void singleCollapse() throws InterruptedException
	{
		Thread.sleep(2000);
        HomePage_PageObject hmpg=new HomePage_PageObject(driver);
        hmpg.clickmore();
        Thread.sleep(1000);
        hmpg.clickCollapsibleContent();
        CollapsibleContent_PageObject collapsesingle=new CollapsibleContent_PageObject(driver);
        collapsesingle.clickSingleCollapse();
        collapsesingle.clickSingleCollapseplusicon1();
        Thread.sleep(2000);
        String info1=collapsesingle.clickSingleCollapseplusicon1info();
        System.out.println("<-------------Know your goals and Prioritize Wisely--------->" );
        System.out.println(info1);
        
        collapsesingle.clickSingleCollapseplusicon2();
        Thread.sleep(2000);
        String info2=collapsesingle.clickSingleCollapseplusicon2info();
        System.out.println("<---------------Be focused and Eliminate Distractions-------------->");
        System.out.println(info2);
        
        collapsesingle.clickSingleCollapseplusicon3();
        Thread.sleep(2000);
        String info3=collapsesingle.clickSingleCollapseplusicon3info();
        System.out.println("<-----------------Chose the right mentor to Succeed in career----------->");
        System.out.println(info3);
        
        
        Thread.sleep(2000);
        long timestamp = System.currentTimeMillis(); // Get timestamp for unique filename
 		TakesScreenshot screenshot= (TakesScreenshot)driver;
 		File screenshotFile=screenshot.getScreenshotAs(OutputType.FILE);
 		try {
 	        FileUtils.copyFile(screenshotFile, new File("Screenshots/SingleCollapse" + timestamp + ".png"));
 	    } catch (IOException e) {
 	        e.printStackTrace();
 	    }
}}
