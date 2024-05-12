package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CreateEmployee_PageObject;
import pageObjects.HomePage_PageObject;
import pageObjects.LoginPage_PageObject;
import testBase.BaseClass;

public class CreateEmployee extends BaseClass {
	
	
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
         
         HomePage_PageObject hmpg=new HomePage_PageObject(driver);
         Thread.sleep(2000);
         hmpg.clickEmployee();
         hmpg.clickCreate();
        
         CreateEmployee_PageObject CreateEmp=new CreateEmployee_PageObject(driver);
         Thread.sleep(2000);
         String FirstName=randomstring().toUpperCase();
         CreateEmp.FirstName(FirstName);
         String LastName=randomstring().toUpperCase();
         CreateEmp.LastName(LastName);
         CreateEmp.EmployeeEmail(randomalphanumeric()+"@gmail.com");
         CreateEmp.Mobileno(randomnumber());
         CreateEmp.DateOfBirth("22/06/2013");
         CreateEmp.Click_FemaleRadioButton();
         CreateEmp.EnterAddress("123 Main Street,Anytown,USA 12345");
         Select Cty=new Select(CreateEmp.SelectCountry());
         System.out.println("No.of Options "+Cty.getOptions().size());
         Thread.sleep(2000);
         Cty.selectByVisibleText("India");
         CreateEmp.SelectOtherCity();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//input[@id='OtherCity']")).sendKeys("Hyderabad");
         
         
         CreateEmp.SelectQAAutomation();
         Thread.sleep(1000);
         CreateEmp.ClickSave();
         
         long timestamp = System.currentTimeMillis(); // Get timestamp for unique filename
 		TakesScreenshot screenshot= (TakesScreenshot)driver;
 		File screenshotFile=screenshot.getScreenshotAs(OutputType.FILE);
 		try {
 	        FileUtils.copyFile(screenshotFile, new File("Screenshots/CreateEmployee" + timestamp + ".png"));
 	    } catch (IOException e) {
 	        e.printStackTrace();
 	    }

}}
