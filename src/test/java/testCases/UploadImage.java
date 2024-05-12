package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage_PageObject;

import pageObjects.LoginPage_PageObject;
import testBase.BaseClass;

public class UploadImage extends BaseClass{
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
		public void uploadimg() throws InterruptedException
	{
		Thread.sleep(2000);
        HomePage_PageObject hmpg=new HomePage_PageObject(driver);
        hmpg.clickmore();
        Thread.sleep(1000);
        hmpg.clickImages();
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver; 
         WebElement chooseFile=driver.findElement(By.xpath("//input[@type='file' and @id='file']"));
     
       
        js.executeScript("arguments[0].click();",chooseFile);
        //Imagepg.clickUpload();
        Thread.sleep(2000);
        chooseFile.sendKeys("C:\\Users\\Admin\\Downloads\\Image001.jpg");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Upload']")).click();
        
        String msg1=driver.findElement(By.xpath("//div[@class='toast toast-success']//div[@class='toast-title']")).getText();
        String msg2=driver.findElement(By.xpath("//div[@class='toast toast-success']//div[@class='toast-message']")).getText();
        
        System.out.println(msg1);
        System.out.println(msg2);
        Thread.sleep(1000);
        long timestamp = System.currentTimeMillis(); // Get timestamp for unique filename
		TakesScreenshot screenshot= (TakesScreenshot)driver;
		File screenshotFile=screenshot.getScreenshotAs(OutputType.FILE);
		try {
	        FileUtils.copyFile(screenshotFile, new File("Screenshots/UploadImage" + timestamp + ".png"));
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    
}}
