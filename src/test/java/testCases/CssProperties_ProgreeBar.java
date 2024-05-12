package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage_PageObject;
import pageObjects.LoginPage_PageObject;
import pageObjects.cSSPropertiesPage_PageObject;
import testBase.BaseClass;

public class CssProperties_ProgreeBar extends BaseClass {

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
	public void progressBars() throws InterruptedException
{
	Thread.sleep(2000);
    HomePage_PageObject hmpg=new HomePage_PageObject(driver);
    hmpg.clickmore();
    Thread.sleep(1000);
    hmpg.clickCSSProperties();
    
    cSSPropertiesPage_PageObject progbars=new cSSPropertiesPage_PageObject(driver);
    progbars.clickProgressBars();
    Thread.sleep(1000);
    System.out.println(progbars.complete40Success());
    System.out.println(progbars.complete20());
    System.out.println(progbars.complete60warning());
    System.out.println(progbars.complete80danger());
}}