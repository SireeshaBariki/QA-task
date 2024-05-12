package testCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage_PageObject;
import pageObjects.LoginPage_PageObject;
import pageObjects.cSSPropertiesPage_PageObject;
import testBase.BaseClass;

public class CssProperties_Links extends BaseClass {
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
		public void links() throws InterruptedException
	{
		Thread.sleep(2000);
	    HomePage_PageObject hmpg=new HomePage_PageObject(driver);
	    hmpg.clickmore();
	    Thread.sleep(1000);
	    hmpg.clickCSSProperties();
	    
	    
	    cSSPropertiesPage_PageObject links=new cSSPropertiesPage_PageObject(driver);
	    links.clickLinks();
	    links.clickLink1();
	    links.ClickLink2();
	    links.clickLink3();
	    links.clickLink4();
	    links.clickLink5();
	    Set<String> windowoptions=driver.getWindowHandles();
	    System.out.println(windowoptions.size());
	    for(String windowid:windowoptions)
	    {
	    	String title=driver.switchTo().window(windowid).getTitle();
	    	System.out.println(title);
	    	if(title.equals("Google"))
	    	{
	    		Thread.sleep(2000);
	    		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Jala Academy");
	    	}
	    }
	    
}}
