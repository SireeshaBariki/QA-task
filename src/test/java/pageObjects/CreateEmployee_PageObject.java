package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateEmployee_PageObject extends BasePage {
	 WebDriver driver;
		
	 public CreateEmployee_PageObject (WebDriver driver)
		{
			super (driver);
			
		}
	 
	 // WebElements Locators+identification

@FindBy(xpath="//input[@id='FirstName']")  WebElement FirstName_TxtBox;
@FindBy(xpath="//input[@id='LastName']")  WebElement LastName_TxtBox;
@FindBy(xpath="//input[@id='EmailId']")  WebElement Email_TxtBox;
@FindBy(xpath="//input[@id='MobileNo']")  WebElement MobileNumber_TxtBox;
@FindBy(xpath="//input[@id='DOB']")  WebElement DateOfBirth;
@FindBy(xpath="//input[@id='rdbMale']")  WebElement Malerdb;
@FindBy(xpath="//input[@id='rdbFemale']")   WebElement Femalerdb;
@FindBy(xpath="//textarea[@id='Address']")  WebElement Address;
@FindBy(xpath="//select[@id='CountryId']")  WebElement Country;
@FindBy(xpath="//select[@id='CityId']")  WebElement city;
@FindBy(xpath="//span[@class='checkmark']")  WebElement otherCity;
@FindBy(xpath="//input[@id='chkSkill_5']")  WebElement AWS;
@FindBy(xpath="//input[@id='chkSkill_3']") WebElement DevOps;
@FindBy(xpath="//input[@id='chkSkill_2']")   WebElement FullStackDeveloper;
@FindBy(xpath="//input[@id='chkSkill_4']")  WebElement MiddleWare;
@FindBy(xpath="//input[@id='chkSkill_1']")   WebElement  QAAutomation;
@FindBy(xpath="//input[@id='chkSkill_6']")  WebElement WebServices;
@FindBy(xpath="//button[normalize-space()='Save']")  WebElement save_btn;

@FindBy(xpath="//a[normalize-space()='Cancel']")  WebElement cancel_btn;

//Action methods
public void FirstName(String fname)
{
	FirstName_TxtBox.sendKeys(fname);
}
public void LastName(String lname)
{
	LastName_TxtBox.sendKeys(lname);
}
public void EmployeeEmail(String Empemail)
{
	Email_TxtBox.sendKeys(Empemail);
}
public void Mobileno(String Mnumber)
{
	MobileNumber_TxtBox.sendKeys(Mnumber);
}
public void DateOfBirth(String dob)
{
	DateOfBirth.sendKeys(dob);
}
public void Click_MaleRadioButton()
{
	Malerdb.click();
}
public void Click_FemaleRadioButton()
{
	Femalerdb.click();
}
public void EnterAddress(String address)
{
	Address.sendKeys(address);
}
public WebElement SelectCountry()
{
	Country.click();
	return Country;
}
public void SelectCity()
{
  city.click();
}
public void SelectOtherCity()
{
  otherCity.click();
}
public void SelectAWS()
{
	AWS.click();
}
public void SelectDevOps()
{
	DevOps.click();
}
public void SelectFullStackDeveloper()
{
	FullStackDeveloper.click();
}
public void SelectMiddleWare()
{
	MiddleWare.click();
}
public void SelectQAAutomation()
{
	QAAutomation.click();
}
public void SelectWebServices()
{
	WebServices.click();
}
public void ClickCancel()
{
	cancel_btn.click();
}
public void ClickSave()
{
	save_btn.click();
}

}
