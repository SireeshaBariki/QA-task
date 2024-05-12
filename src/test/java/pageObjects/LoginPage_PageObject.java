package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_PageObject extends BasePage {
	 WebDriver driver;
		
	 public LoginPage_PageObject (WebDriver driver)
		{
			super (driver);
			
		}
	 
	 // WebElements Locators+identification

@FindBy(xpath="//input[@id='UserName']")  WebElement emailOrMobileNo;
@FindBy(xpath="//input[@id='Password']")  WebElement password;
//@FindBy(xpath="//span[@class='checkmark']")  WebElement rememberMe;
@FindBy(xpath="//button[@id='btnLogin']")  WebElement signIn;
//@FindBy(xpath="//a[normalize-space()='Forgot Password']")  WebElement forgotPassword;
//@FindBy(xpath="//a[normalize-space()='Admin Login']")  WebElement adminLogin;
	 


//Action methods
public void enterEmail(String email)
{
	emailOrMobileNo.sendKeys(email);
}
public void enterPassword(String pwd)
{
	password.sendKeys(pwd);
}
public void signInClick()
{
	signIn.click();
}
}
