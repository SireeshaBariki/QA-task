package testCases;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import pageObjects.HomePage_PageObject;
import pageObjects.LoginPage_PageObject;
import testBase.BaseClass;

public class InValidCredentials extends BaseClass {

	@Test
	public void login() throws InterruptedException
	{
		LoginPage_PageObject loginpg=new LoginPage_PageObject(driver);
		
		loginpg.enterEmail("train@jalaacademy.com");
		
		loginpg.enterPassword("jobprogramming");
		
		loginpg.signInClick();
		Thread.sleep(2000);
		String Invalid=driver.findElement(By.xpath("//div[@class='toast-title']")).getText();
		
		
		HomePage_PageObject homepg=new HomePage_PageObject(driver);
		
		String ActualTitle=homepg.displaymagnus();
       
        if(ActualTitle.equals("Magnus"))
        {
        	System.out.println("Test Passed");
        	
        }
        else 
        {
        	System.out.println("Test Failed due to the " +Invalid);
        }

		
	}
}
