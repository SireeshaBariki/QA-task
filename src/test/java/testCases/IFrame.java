package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage_PageObject;
import pageObjects.IFrame_PageObject;
import pageObjects.LoginPage_PageObject;
import testBase.BaseClass;

public class IFrame extends BaseClass {
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
		public void iframes() throws InterruptedException
	{
		Thread.sleep(2000);
        HomePage_PageObject hmpg=new HomePage_PageObject(driver);
        hmpg.clickmore();
        Thread.sleep(1000);
        hmpg.clickIFrames();
        Thread.sleep(1000);
        IFrame_PageObject iframepg=new IFrame_PageObject(driver);
        iframepg.clickFrameone();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        iframepg.clickFrameTwo();
        WebElement user=driver.findElement(By.xpath("//p[normalize-space()='Guest User']"));
        System.out.println(user.getText());
        

}}
