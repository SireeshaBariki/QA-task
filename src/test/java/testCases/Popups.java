package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage_PageObject;
import pageObjects.LoginPage_PageObject;
import pageObjects.Popupspage_PageObject;
import testBase.BaseClass;

public class Popups extends BaseClass {
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
		public void popups() throws InterruptedException
	{
		Thread.sleep(2000);
	    HomePage_PageObject hmpg=new HomePage_PageObject(driver);
	    hmpg.clickmore();
	    Thread.sleep(1000);
	    hmpg.clickPopups();
	    Popupspage_PageObject popuppg=new Popupspage_PageObject(driver);
	    popuppg.clickinWindowPopup();
	    Thread.sleep(1000);
	    popuppg.inWindowpopup_closebtn();
	    Thread.sleep(1000);
	    popuppg.clickAlert();
	    Thread.sleep(1000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);
	    popuppg.clickconfirm();
	    Thread.sleep(1000);
	    driver.switchTo().alert().dismiss();
	    Thread.sleep(2000);
	    popuppg.clickpromptBox();
	   // System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().sendKeys("Jala Academy");
	    Thread.sleep(1000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);
}}
