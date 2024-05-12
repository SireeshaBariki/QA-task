package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage_PageObject;
import pageObjects.LoginPage_PageObject;
import pageObjects.cSSPropertiesPage_PageObject;
import testBase.BaseClass;

public class CssProperties_Buttons extends BaseClass {
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
		public void buttons() throws InterruptedException
	{
		Thread.sleep(2000);
	    HomePage_PageObject hmpg=new HomePage_PageObject(driver);
	    hmpg.clickmore();
	    Thread.sleep(1000);
	    hmpg.clickCSSProperties();
	    
	    
	    cSSPropertiesPage_PageObject buttons=new cSSPropertiesPage_PageObject(driver);
	    buttons.clickButtons();
	    System.out.println(buttons.clickDanger_txt());
	    System.out.println(buttons.ClickDefault_txt());
	    System.out.println(buttons.clickPrimary_txt());
	    System.out.println(buttons.clickSuccess_txt());
	    System.out.println(buttons.clickWarning_txt());
}}
