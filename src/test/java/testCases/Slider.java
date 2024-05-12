package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage_PageObject;
import pageObjects.LoginPage_PageObject;

import testBase.BaseClass;

public class Slider extends BaseClass {
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
		public void movingSlider() throws InterruptedException
	{
		Thread.sleep(2000);
        HomePage_PageObject hmpg=new HomePage_PageObject(driver);
        hmpg.clickmore();
        Thread.sleep(1000);
        hmpg.clickSlider();
        
      //Move Slider 
		 WebElement slider=driver.findElement(By.xpath("//div[@class='slider-handle min-slider-handle round']"));
		 System.out.println("The present position of the slider is:"+slider.getLocation());
		 
		 Actions act=new Actions(driver);
		 act.dragAndDropBy(slider,500,300).perform();
		 System.out.println("The position of the slider after movement is:"+slider.getLocation());
        
}}
