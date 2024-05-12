package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchEmployee_PageObject extends BasePage {
	
	WebDriver driver;
	
	 public SearchEmployee_PageObject (WebDriver driver)
		{
			super (driver);
			
		}
	 
	 // WebElements Locators+identification


@FindBy(xpath="//input[@id='Name']")  WebElement name;
@FindBy(xpath="//input[@id='MobileNo']")  WebElement mobileNo;
@FindBy(xpath="//button[@id='btnSearch']")  WebElement search;
@FindBy(xpath="//button[@id='btnClear']")  WebElement clear;
@FindBy(xpath="//a[normalize-space()='Add Employee']")  WebElement addEmployee;
@FindBy(xpath="//span[normalize-space()='Next']")  WebElement next;
@FindBy(xpath="//span[normalize-space()='Last']")  WebElement last;
@FindBy(xpath="//a[contains(@aria-label,'First')]")  WebElement first;
@FindBy(xpath="//span[normalize-space()='Previous']") WebElement previous;

//Action methods
public void EnterName(String searchname)
{
	name.sendKeys(searchname);
}

public void Search_btn()
{
	search.click();
}

}







