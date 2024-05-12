package testCases;





import org.testng.Assert;
import org.testng.annotations.Test;



import pageObjects.HomePage_PageObject;
import pageObjects.LoginPage_PageObject;
import testBase.BaseClass;

public class Login extends BaseClass {

	
	

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

}
