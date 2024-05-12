package testCases;

import java.io.IOException;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage_PageObject;
import pageObjects.LinksPage_PageObject;
import pageObjects.LoginPage_PageObject;
import testBase.BaseClass;

public class BrokenLinks extends BaseClass {
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
		public void brokenlinks() throws InterruptedException, IOException {
	
		Thread.sleep(2000);
	    HomePage_PageObject hmpg=new HomePage_PageObject(driver);
	    hmpg.clickmore();
	    Thread.sleep(1000);
	    hmpg.clickLinks();
	    LinksPage_PageObject brokenlk=new LinksPage_PageObject(driver);
	    brokenlk.clickBrokenLink();
	    List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+links.size()); 
		
		brokenlk.clickLink1();
		Thread.sleep(1000);
		brokenlk.clickLink2();
		Thread.sleep(1000);
		brokenlk.clickLink3();
		Thread.sleep(1000);
		Set<String> windowoptions=driver.getWindowHandles();
	    System.out.println(windowoptions.size());
	    for(String windowid:windowoptions)
	    {
	    	String title=driver.switchTo().window(windowid).getCurrentUrl();
	    	System.out.println(title);
	    }

	}}
