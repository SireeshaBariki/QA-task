package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinksPage_PageObject extends BasePage {
WebDriver driver;
	
	public LinksPage_PageObject (WebDriver driver)
		{
			super (driver);
			
		}
	 
// WebElements Locators+identification
//Broken Links
@FindBy(xpath="//a[normalize-space()='Broken Links']")  WebElement brokenLinks;
@FindBy(xpath="//a[@href='www.brokenlinkcheck.com/'][normalize-space()='Link 1']")  WebElement link1;
@FindBy(xpath="//a[@href='www.brokenlinkcheck.com/'][normalize-space()='Link 2']")   WebElement link2;
@FindBy(xpath="//a[@href='www.brokenlinkcheck.com/'][normalize-space()='Link 3']")  WebElement link3;

//Action Methods for Broken Links
public void clickLink1()
{
link1.click();	
}
public void clickLink2()
{
link2.click();	
}
public void clickLink3()
{
link3.click();	
}
public void clickBrokenLink()
{
	brokenLinks.click();	
}
}
